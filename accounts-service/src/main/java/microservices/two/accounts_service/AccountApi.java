package microservices.two.accounts_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountApi {
    @Autowired
    private AccountService service;

    @GetMapping("/holder/{customer}")
    public List<Account> readByCustomerApi(@PathVariable("customer") int customer){
        return service.readByCustomer(customer);
    }
    @DeleteMapping("/{account}")
    public void deleteApi(@PathVariable("account") long account){
        service.delete(account);
    }
    @PutMapping("/")
    public Account updateApi(@RequestBody Account account){
        return service.create(account);
    }
    @GetMapping("/")
    public List<Account> readAllApi(){
        return service.readAll();
    }
    @GetMapping("/{account}")
    public Optional<Account> readOneApi(@PathVariable("account") long account){
        return service.readOne(account);
    }
    @PostMapping("/")
    public Account createApi(@RequestBody Account account){
        return service.create(account);
    }
}
