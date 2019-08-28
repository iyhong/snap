package com.example.snap.account;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class AccountControllerTest {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private PhotographerRepository photographerRepository;


//    @Test
//    public void putAccount(){
//        Account account = new Account();
//        account.setId("test11");
//        account.setPassword("aaa");
//        account.setAuthYN("N");
//        account.setAccountType("2");
//        account.setEmail("test@test.com");
//        accountRepository.save(account);
//
//        Photographer photographer = new Photographer();
//        photographer.setAccount(account);
//        photographer.setAddress("test address");
//        photographer.setName("dd");
//        photographerRepository.save(photographer);
//    }

}