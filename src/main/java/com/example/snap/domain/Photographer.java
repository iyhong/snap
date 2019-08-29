package com.example.snap.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public class Photographer extends Login {

    @Column(name = "address2_id")
    private Integer address2Id;

    @Column(name = "homepage")
    private String homepage;

}
