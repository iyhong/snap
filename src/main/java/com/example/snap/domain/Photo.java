package com.example.snap.domain;

import com.example.snap.account.Account;

import javax.persistence.Column;
import java.util.Date;

//@Entity
//@Data
//@DiscriminatorValue("P")
public class Photo extends Account {

    @Column(name = "filename")
    private String fileName;

    @Column(name = "filetype")
    private String fileType;

    @Column(name = "location")
    private String location;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}
