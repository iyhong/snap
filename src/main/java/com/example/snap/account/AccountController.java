package com.example.snap.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/accounts")
    public void register(@RequestBody Account account){

        accountRepository.save(account);
    }

    @GetMapping("/accounts")
    public List<Account> getAccounts () {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable("id") String id){
        return accountRepository.findById(id);
    }

}
