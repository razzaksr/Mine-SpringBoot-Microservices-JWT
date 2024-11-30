package microservices.two.accounts_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repository;

    public List<Account> readByCustomer(int customer){
        return repository.findAllByCustomer(customer);
    }
    public void delete(long account){
        repository.deleteById(account);
    }
    public List<Account> readAll(){
        return repository.findAll();
    }
    public Optional<Account> readOne(long account){
        return repository.findById(account);
    }
    public Account create(Account account){
        return repository.save(account);
    }
}
