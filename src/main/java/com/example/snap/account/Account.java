package com.example.snap.account;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@Builder @Getter
@Setter @AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Account {
    @Id
    private @Column(name = "id") String id;
    private @Column(name = "password")String password;
    private @Column(name = "email")String email;
    private @Column(name = "account_type")String accountType;
}
