package microservices.five.beneficiary_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payee")
public class BeneficiaryApi {
    @Autowired
    private BeneficiaryService service;
    @GetMapping("/sender/{root}")
    public List<Beneficiary> readAllByRootApi(@PathVariable("root") long root){
        return service.readAllByRoot(root);
    }
    @GetMapping("/")
    public List<Beneficiary> readAllApi(){
        return service.readAll();
    }
    @PostMapping("/")
    public Beneficiary createApi(@RequestBody Beneficiary beneficiary){
        return service.create(beneficiary);
    }
}
