package alchemy.account.controller;

import alchemy.account.model.Account;
import alchemy.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by mbranca on 02/09/15.
 */
@Controller
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Account> getAccounts() {
        return accountService.getAccounts();
    }
}
