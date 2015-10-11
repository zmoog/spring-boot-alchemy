package alchemy.controller;

import alchemy.model.Account;
import alchemy.model.Transfer;
import alchemy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mbranca on 02/09/15.
 */
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Account>> getAccounts() {
        return new ResponseEntity<Iterable<Account>>(accountService.getAllAccounts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<?> createAccount(@RequestBody Account account) {

        account = accountService.createAccount(account);

        HttpHeaders responseHeaders = new HttpHeaders();
        URI newAccountUri  = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(account.getId())
                .toUri();
        responseHeaders.setLocation(newAccountUri);

        return new ResponseEntity<Object>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/accounts/{accountId}/transfers", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Transfer>> getTransferForAccount(@PathVariable Long accountId) {
        return new ResponseEntity<Iterable<Transfer>>(accountService.findTransferFor(accountId), HttpStatus.OK);
    }
}
