package com.example.demo2.model.vo;

import com.example.demo2.model.entity.Parent;
import com.example.demo2.model.entity.Pet;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChildVO {
    private UUID cUuid;
    private String cName;
    private List<Pet> petList;
}
