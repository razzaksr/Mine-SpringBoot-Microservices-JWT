package microservices.five.beneficiary_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeneficiaryService {
    @Autowired
    private BeneficiaryRepository repository;

    public List<Beneficiary> readAllByRoot(long root){
        return repository.findAllByRootAccount(root);
    }
    public List<Beneficiary> readAll(){
        return repository.findAll();
    }
    public Optional<Beneficiary> readOne(int id){
        return repository.findById(id);
    }
    public Beneficiary create(Beneficiary beneficiary){
        return repository.save(beneficiary);
    }
}
