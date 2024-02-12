package com.example.demo2.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PARENT" ,schema = "PUBLIC")
public class Parent {
    @Id
    @Column(name = "P_UUID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID puuid;

    @Column(name = "P_ID")
    private String pid;

    @Column(name = "P_NAME")
    private String pname;

    @Column(name = "P_AGE")
    private int page;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parent") // 使用属性名称进行映射
    private List<Child> childList;
}
