package com.example.snap.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    ItemRepository itemRepository;
    @GetMapping("/test/{id}")
    public void test(@PathVariable Long id){
        Movie movie = new Movie();
        movie.setId(id);
        movie.setName("name1");
        movie.setActor("actor1");
        movie.setDirector("dir1");
        itemRepository.save(movie);
        System.out.println(movieRepository.findById(id).toString());
    }
}
