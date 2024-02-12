package com.example.demo2.model.repository;

import com.example.demo2.model.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Parentrepository extends JpaRepository<Parent, UUID> {
    Parent findByPuuid(UUID uuid);

    Parent findByPid(String pid);


    @Query(value = "select * from parent where P_NAME = :name", nativeQuery = true)
    Parent findByPnameStr(String name);
}
