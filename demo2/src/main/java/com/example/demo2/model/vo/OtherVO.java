package com.example.demo2.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherVO {
    private String ownername;

    private String type;

    private UUID petuuid;
}
