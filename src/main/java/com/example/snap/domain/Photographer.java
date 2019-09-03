package com.example.snap.domain;

import com.example.snap.account.Account;

import javax.persistence.Column;

//@Entity
//@Data
//@ToString
//@DiscriminatorValue("G")
public class Photographer extends Account {

    @Column(name = "name")
    private String name;

    @Column(name = "address2_id")
    private Integer address2Id;

    @Column(name = "homepage")
    private String homepage;

}
