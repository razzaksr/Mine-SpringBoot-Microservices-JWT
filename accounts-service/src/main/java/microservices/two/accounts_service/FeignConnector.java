package microservices.two.accounts_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "BENEFICIARY-SERVICE")
public interface FeignConnector {
    @GetMapping("/payee/sender/{root}")
    List<Beneficiary> receivePayeesFromService(@PathVariable("root") long root);
}
