package com.example.demo2.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PET",schema = "PUBLIC")
public class Pet {

    @Id
    @Column(name = "PET_UUID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID petuuid;

    @Column(name = "PET_TYPE")
    private String type;

    @Column(name = "OWNER")
    private String owner;
}
