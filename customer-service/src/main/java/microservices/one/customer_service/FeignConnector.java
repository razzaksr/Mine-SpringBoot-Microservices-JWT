package microservices.one.customer_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8072",name = "Feign-Connector")
@FeignClient(name = "ACCOUNTS-SERVICE")
public interface FeignConnector {
    @GetMapping("/holder/{customer}")
    List<Account> receiveAccountsFromService(@PathVariable("customer") int customer);
}
