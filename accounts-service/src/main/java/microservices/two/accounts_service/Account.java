package microservices.two.accounts_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.List;

@Entity
public class Account implements Serializable {
    @Id
    private long accountNumber;
    private String accountType;
    private double accountBalance;
    private int customer;
    private transient List<Beneficiary> myPayees;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public List<Beneficiary> getMyPayees() {
        return myPayees;
    }

    public void setMyPayees(List<Beneficiary> myPayees) {
        this.myPayees = myPayees;
    }
}
