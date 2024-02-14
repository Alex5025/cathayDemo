package com.example.demo2.model.bo;

import com.example.demo2.model.Authority;
import lombok.Data;

import java.util.UUID;

@Data
public class AdminBO {
    private UUID adminUuid;
    //  private String adminLastName;
    // private String adminFirstName;
    private String adminEmail;
    private String adminMobilePhone;
    // private String adminAccount;
    // private String adminPwd;
    private Authority a1Authority;
}
