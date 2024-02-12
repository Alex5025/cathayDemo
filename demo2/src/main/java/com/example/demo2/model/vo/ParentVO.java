package com.example.demo2.model.vo;

import com.example.demo2.model.entity.Child;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParentVO {
    private UUID pUuid;
    private String pName;
    private List<ChildVO> childVOList;
}
