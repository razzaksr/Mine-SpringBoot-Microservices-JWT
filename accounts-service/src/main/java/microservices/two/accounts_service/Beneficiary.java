package microservices.two.accounts_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Beneficiary {
    private int beneficiaryId;
    private long beneficiaryAccount;
    private long rootAccount;
    private String beneficiaryName;

    public int getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(int beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public long getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(long beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public long getRootAccount() {
        return rootAccount;
    }

    public void setRootAccount(long rootAccount) {
        this.rootAccount = rootAccount;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }
}
