package microservices.one.customer_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    @Autowired(required = true)
    private FeignConnector connector;

    public Customer create(Customer customer){
        return repository.save(customer);
    }
    public Optional<Customer> readOne(int id){
        Optional<Customer> found = repository.findById(id);
        found.stream().map(obj->{
            obj.setMyAccounts(connector.receiveAccountsFromService(obj.getCustomerId()));
            return obj;
        }).collect(Collectors.toList());
        return found;
    }
    public List<Customer> readAll(){
        List<Customer> every = repository.findAll();
        every.stream().map(obj->{
            obj.setMyAccounts(connector.receiveAccountsFromService(obj.getCustomerId()));
            return obj;
        }).collect(Collectors.toList());
        return every;
    }
    public void delete(int id){
        repository.deleteById(id);
    }
}
