package microservices.two.accounts_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repository;
    @Autowired
    private FeignConnector feignConnector;

    public List<Account> readByCustomer(int customer){
        List<Account> collected = repository.findAllByCustomer(customer);
        collected.stream().map(obj->{
            obj.setMyPayees(feignConnector.receivePayeesFromService(obj.getAccountNumber()));
            return obj;
        }).collect(Collectors.toList());
        return collected;
    }
    public void delete(long account){
        repository.deleteById(account);
    }
    public List<Account> readAll(){
        List<Account> collected = repository.findAll();
        collected.stream().map(obj->{
            obj.setMyPayees(feignConnector.receivePayeesFromService(obj.getAccountNumber()));
            return obj;
        }).collect(Collectors.toList());
        return collected;
    }
    public Optional<Account> readOne(long account){
        Optional<Account> collected = repository.findById(account);
        collected.stream().map(obj->{
            obj.setMyPayees(feignConnector.receivePayeesFromService(obj.getAccountNumber()));
            return obj;
        }).collect(Collectors.toList());
        return collected;
    }
    public Account create(Account account){
        return repository.save(account);
    }
}
