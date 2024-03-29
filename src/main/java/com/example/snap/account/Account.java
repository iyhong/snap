package com.example.snap.account;

import com.example.snap.domain.Login;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString(callSuper = true)
@Data
@DiscriminatorColumn(name = "ACCOUNT_TYPE")
@Inheritance(strategy =  InheritanceType.JOINED)
public class Account extends Login {

    @Column(name = "email")
    private String email;

    @Column(name = "auth_yn")
    private String authYN;

    @Column(name = "auth_key")
    private String authKey;

}
