package com.example.demo2.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AdminDTO {
    @NotBlank(message = "姓氏不得空白")
    private String adminLastName;
    @NotBlank(message = "名字不得空白")
    private String adminFirstName;
    @Email(message = "Email 格式異常")
    private String adminEmail;
    @NotBlank
    @Pattern(regexp = "^09[0-9]{8}$", message = "手機號碼異常")
    private String adminMobilePhone;
    @NotBlank
    private String adminAccount;
    @NotBlank
    private String adminPwd;
    private AuthorityDTO authorityDTO;

 }
