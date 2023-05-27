package com.ecm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Desc 所有实体类的超类
 * @Date 2023/5/27 9:01 下午
 * @Author zhxy
 **/
public class BaseEntity {

    private String createdBy;
    private String updatedBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;

}
