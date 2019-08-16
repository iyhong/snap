package com.example.snap.account;

import com.example.snap.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/")
public class AccountController {

    private static Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountRepository accountRepository;

//    @PostMapping("/accounts")
//    public void register(@RequestBody Account account){
//
//        accountRepository.save(account);
//    }

    @PostMapping("/accounts")
    public Result login(@RequestParam("id") String id, @RequestParam("password") String password){
        Result result = new Result();
        Account account = accountRepository.findById(id);
        logger.debug("-----------------------param id: "+id);
        if(account == null){
            result.setCode(HttpStatus.BAD_REQUEST.value());
            result.setMessage("There is no ID");
            return result;
        }

        if(!account.getPassword().equals(password)){
            result.setCode(HttpStatus.UNAUTHORIZED.value());
            result.setMessage("Unauthorized login failed");
            return result;
        }

        return result;

    }

    @GetMapping("/accounts")
    public List<Account> getAccounts () {
        return accountRepository.findAll();
    }

    @GetMapping("/accounts/{id}")
    public Result<Account> getAccount(@PathVariable("id") String id){
        Result<Account> result = new Result<>();
        Account account = accountRepository.findById(id);
        if(account == null){
            result.setCode(HttpStatus.BAD_REQUEST.value());
            result.setMessage("There is no ID");
            return result;
        }
        result.setResult(account);
        return result;


    }

}
