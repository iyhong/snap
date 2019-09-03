package com.example.snap.test;

import lombok.Data;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue("M")
@ToString(callSuper = true)
public class Movie extends Item {
    private String director;
    private String actor;
}
