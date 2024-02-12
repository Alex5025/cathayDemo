package com.example.demo2.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor // 添加无参构造函数
@AllArgsConstructor // 添加带有所有属性的构造函数
@Table(name = "CHILD", schema = "PUBLIC")
/**
 *
 */
public class Child {
    @Id
    @Column(name = "C_UUID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private UUID cuuid;

    @Column(name = "C_ID")
    private String cid;

    @Column(name = "C_NAME")
    private String cname;

    @Column(name = "C_AGE")
    private int cage;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "P_UUID_FK", nullable = false) // 使用正确的列名和设置 optional 为 false
    private Parent parent;
}
