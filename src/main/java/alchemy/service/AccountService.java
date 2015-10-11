package alchemy.service;

import alchemy.model.Account;
import alchemy.model.Transfer;
import alchemy.repository.AccountRepository;
import alchemy.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mbranca on 02/09/15.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    TransferRepository transferRepository;

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Iterable<Transfer> findTransferFor(final Long accountId) {
        return transferRepository.findBySourceIdOrDestinationId(accountId, accountId);
    }
}
