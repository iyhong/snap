package com.example.snap.domain;

import com.example.snap.account.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "photographer")
public class Photographer implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "id")
    private Account account;

    @Column(name = "name")
    private String name;

    @Column(name = "address2_id")
    private String address;

    @Column(name = "homepage")
    private String homepage;


}
