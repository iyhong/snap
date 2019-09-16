package com.example.snap.test;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Team {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;


}
