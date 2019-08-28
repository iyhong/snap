package com.example.snap.account;

import com.example.snap.domain.Login;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "account")
@Builder @Getter
@Setter @AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Account extends Login {

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
