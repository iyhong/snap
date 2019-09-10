package com.example.snap.test;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Member implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    @Column(name = "name")
    private String name;

}
