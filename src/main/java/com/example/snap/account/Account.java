package com.example.snap.account;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "account")
@Builder @Getter
@Setter @AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Account extends Login{

    @NotEmpty
    @Column(name = "email")
    private String email;

    @NotEmpty
    @Column(name = "account_type")
    private String accountType;

    @Column(name = "auth_yn")
    private String authYN;

    @Column(name = "auth_key")
    private String authKey;
}
