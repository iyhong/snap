package com.example.snap.test;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Log {
    @Id
    @Column(name = "id")
    private Long id;
    private String account;
    private String password;

}
