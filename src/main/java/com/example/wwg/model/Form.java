package com.example.wwg.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class Form implements Serializable {
    private Long formId;

    private String userName;

    private String sex;

    private String formType;

    private String adDiv;

    private String phone;

    private String email;

    private String address;

    private String formTitle;

    private String formContent;
}