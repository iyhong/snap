package com.example.snap.domain;

import lombok.Data;
import sun.util.calendar.BaseCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
@Data
public class Photo {
    @Id
    @JoinColumn(name = "photographer")
    private String photographer;

    @Column(name = "filename")
    private String fileName;

    @Column(name = "filetype")
    private String fileType;

    @Column(name = "location")
    private String location;

    @Column(name = "create_time")
    private BaseCalendar.Date createTime;

    @Column(name = "update_time")
    private BaseCalendar.Date updateTime;
}
