package microservices.one.customer_service;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    private String customerName;
    @Column(unique = true)
    private String username;
    private String password;
    private long customerContact;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(long customerContact) {
        this.customerContact = customerContact;
    }
}
