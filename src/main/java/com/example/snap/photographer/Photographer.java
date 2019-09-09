package com.example.snap.photographer;

import com.example.snap.account.Account;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@ToString(callSuper = true)
@DiscriminatorValue("2")
public class Photographer extends Account {

    @Column(name = "name")
    private String name;

    @Column(name = "address2_id")
    private Integer address2Id;

    @Column(name = "homepage")
    private String homepage;

}
