package com.example.snap.photographer;

import com.example.snap.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PhotographerController {


    @Autowired
    private PhotographerRepository photographerRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping("/photographer/{id}")
    public Photographer setPhoto(@PathVariable String id){
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
        photographer.setId(id);
        photographer.setAddress2Id(30);
        photographer.setName("test");
        photographerRepository.save(photographer);

        Photo photo = new Photo();
        photo.setCreateTime(new Date());
        photo.setUpdateTime(new Date());
        photo.setFilename("test.jpg");
        photo.setFiletype("image/jpeg");
        photo.setPhotographer(photographer);
        photoRepository.save(photo);

        Photo photo2 = new Photo();
        photo2.setCreateTime(new Date());
        photo2.setUpdateTime(new Date());
        photo2.setFilename("test.jpg");
        photo2.setFiletype("image/jpeg");
        photo2.setPhotographer(photographer);
        photoRepository.save(photo2);

        return photographer;
    }

    @GetMapping("photo/{id}")
    private List<Photo> getPhotoList(@PathVariable String id){
        return photoRepository.findByPhotographer_Id(id);
    }
}
