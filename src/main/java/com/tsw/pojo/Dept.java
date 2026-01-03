package com.tsw.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class Dept {
    private Integer id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
