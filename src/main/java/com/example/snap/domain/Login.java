package com.example.snap.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@ToString
@MappedSuperclass
public class Login {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "password")
    private String password;

}
