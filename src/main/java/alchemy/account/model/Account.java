package alchemy.account.model;

/**
 * Created by mbranca on 02/09/15.
 */
public class Account {

    // attributes

    private long id;
    private String name;
    private AccountType type;
    private float balance;

    public Account(long id, String name, AccountType accountType, float balance) {
        this.id = id;
        this.name = name;
        this.type = accountType;
        this.balance = balance;
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
