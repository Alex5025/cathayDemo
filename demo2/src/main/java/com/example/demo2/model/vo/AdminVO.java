package com.example.demo2.model.vo;

import lombok.Data;

import java.util.UUID;

@Data
public class AdminVO {
    private UUID adminUuid;
    private String adminLastName;
    // private String adminFirstName;
    private String adminEmail;
    private String adminMobilePhone;
    // private String adminAccount ;
    // private String  adminPwd;
    private AuthorityVO a1AuthorityVo;
}
