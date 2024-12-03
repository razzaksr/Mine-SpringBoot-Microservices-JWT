package microservices.one.customer_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class CustomerApi {
    @Autowired
    private CustomerService service;
    // endpoints
    @PutMapping("/")
    public Customer updateApi(@RequestBody Customer customer){
        return service.create(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteApi(@PathVariable("id") int id){
        service.delete(id);
    }
    @GetMapping("/{id}")
    public Optional<Customer> readOneApi(@PathVariable("id") int id){
        return service.readOne(id);
    }
    @GetMapping("/")
    public List<Customer> readAllApi(){
        return service.readAll();
    }
//    @PostMapping("/")
//    public Customer createApi(@RequestBody Customer customer){
//        return service.create(customer);
//    }
}
