package com.example.snap.photographer;

import com.example.snap.account.Account;
import com.example.snap.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.List;

@RestController
public class PhotographerController {


    @Autowired
    private PhotographerRepository photographerRepository;

    @Autowired
    private AccountRepository accountRepository;

    @PersistenceContext
    private EntityManager em;

    @GetMapping("/test")
    public void test(){
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
        List<Photographer> accounts = photographerRepository.findAll();
        for (Photographer account: accounts ) {
            System.out.println(account.getId());
            System.out.println(account.getAddress2Id());
            System.out.println(account.toString());
        }
        Account account = new Account();
        account.setId("test1");
        account.setAccountType("2");
        account.setEmail("test@test.com");
        account.setAuthYN("N");
        account.setPassword("aaa");
//        em.persist(account);
        Photographer photographer = new Photographer();
        photographer.setAddress2Id(30);
        photographer.setName("test");
        em.persist(photographer);
//        tx.commit();
    }
}
