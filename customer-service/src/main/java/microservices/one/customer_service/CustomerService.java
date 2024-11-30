package microservices.one.customer_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer create(Customer customer){
        return repository.save(customer);
    }
    public Optional<Customer> readOne(int id){
        return repository.findById(id);
    }
    public List<Customer> readAll(){
        return repository.findAll();
    }
    public void delete(int id){
        repository.deleteById(id);
    }
}
