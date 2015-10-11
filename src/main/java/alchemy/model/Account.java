package alchemy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mbranca on 02/09/15.
 */
@Entity
public class Account {

    // attributes
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private AccountType type;

    @Column
    private float balance;

    public Account(long id, String name, AccountType accountType, float balance) {
        this.id = id;
        this.name = name;
        this.type = accountType;
        this.balance = balance;
    }

    // constructors

    public Account() {
    }

    // accessors

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AccountType getType() {
        return type;
    }

    public float getBalance() {
        return balance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
