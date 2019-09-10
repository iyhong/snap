package com.example.snap.photographer;

import com.example.snap.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

        Photographer photographer = new Photographer();
        photographer.setId("test111");
        photographer.setAddress2Id(30);
        photographer.setName("test");
        photographerRepository.save(photographer);
    }
}
