package microservices.one.customer_service;

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
