package com.example.demo2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AUTHORITY")
public class Authority {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int authorityId;

    /**
     * 權限分級必田以數字表示
     * 上限 100
     * 下限 -10
     * 0~100 權限等級
     * 未啟用 0
     * -10 ~ -1 限制權限
     */
//    @NotNull
//    @Size(max = 100, min = -10)
    @Column(name = "AUTHORITY")
    private int authority;

    @Column(name = "state")
    private Boolean state;
}

