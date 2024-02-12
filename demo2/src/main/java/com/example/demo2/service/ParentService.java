package com.example.demo2.service;

import com.example.demo2.model.entity.Parent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface ParentService {

    Parent findBypUuid(UUID uuid);

    Parent findBypId(String pId);

    Parent findBypName(String name);

    void save(Parent build);
}
