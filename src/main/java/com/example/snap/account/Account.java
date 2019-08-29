package com.example.snap.account;

import com.example.snap.domain.Photo;
import com.example.snap.domain.Photographer;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "account")
@Builder @Getter
@Setter @AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account extends Photographer {

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

    @OneToMany
    @JoinColumn(name = "id")
    private Photo photo;

}
