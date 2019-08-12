package com.example.snap.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/account")
    public void get(){
        Account account = new Account.AccountBuilder()
                            .id("test")
                            .email("test@test.com")
                            .password("test")
                            .accountType("2")
                            .build();
        accountRepository.save(account);
    }

    @ResponseBody
    @GetMapping("/accounts")
    public Account getAccounts () {
        return accountRepository.findById("test");
    }

}
