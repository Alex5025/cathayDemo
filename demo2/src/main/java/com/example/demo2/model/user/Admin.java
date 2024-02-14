package com.example.demo2.model.user;


import com.example.demo2.model.Authority;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * 管理者相關資料
 * 姓
 * 名
 * 權限 (1~99)
 * 狀態
 * Email
 * mobile phone
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "ADMIN")
public class Admin {

    @Id
    @Column(name = "A1_UUID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID adminUuid;
    /**
     * 姓
     */
    //@NotNull(message = "請輸入姓氏")
    //@NotBlank(message = "姓氏不得空白")
    @Column(name = "A1_LAST_NAME")
    private String adminLastName;

    /**
     * 名
     */
//    @NotNull(message = "請輸入名字")
//    @NotBlank(message = "名字不得空白")
    @Column(name = "A1_FIRST_NAME")
    private String adminFirstName;

    //    @Email(message = "Email 格式異常")
    @Column(name = "A1_EMAIL")
    private String adminEmail;

    //    @NotBlank
    @Pattern(regexp = "^09[0-9]{8}$", message = "手機號碼異常")
    @Column(name = "A1_MOBILE_PHONE")
    private String adminMobilePhone;

    @Column(name = "A1_ACCOUNT")
    private String adminAccount;

    @Column(name = "A1_PWD")
    private String adminPwd;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "AUTHORITY_authorityId")
    private Authority a1Authority;
}

