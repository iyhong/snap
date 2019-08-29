package com.example.snap.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Address1 address1;
}
