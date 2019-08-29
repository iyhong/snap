package com.example.snap.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
}
