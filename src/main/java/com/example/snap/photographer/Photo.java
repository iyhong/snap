package com.example.snap.photographer;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long no;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "photographer")
    private Photographer photographer;

    @Column(name = "filename")
    private String filename;

    @Column(name = "filetype")
    private String filetype;

    @Column(name = "location")
    private String location;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
