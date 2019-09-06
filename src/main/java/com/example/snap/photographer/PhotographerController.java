package com.example.snap.photographer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhotographerController {


    @Autowired
    private PhotographerRepository photographerRepository;

    @GetMapping("/test")
    public void test(){
        List<Photographer> accounts = photographerRepository.findAll();
        for (Photographer account: accounts ) {
            System.out.println(account.getId());
            System.out.println(account.getAddress2Id());
            System.out.println(account.toString());
        }
    }
}
