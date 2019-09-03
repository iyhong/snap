package com.example.snap.test;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@ToString(callSuper = true)
public abstract class Item extends Log {


    private String name;

    private int price;

}
