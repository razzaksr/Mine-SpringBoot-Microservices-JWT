package microservices.five.beneficiary_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary,Integer> {
    List<Beneficiary> findAllByRootAccount(long rootAccount);
}
