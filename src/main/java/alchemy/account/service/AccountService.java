package alchemy.account.service;

import alchemy.account.model.Account;
import alchemy.account.model.AccountType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mbranca on 02/09/15.
 */
@Service
public class AccountService {

    List<Account> accounts;

    public AccountService() {

        accounts = new ArrayList<>();

        accounts.add(new Account(1, "Hardware", AccountType.EXPENSE, 100.0f));
        accounts.add(new Account(2, "Lunch", AccountType.EXPENSE, 400.0f));
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
