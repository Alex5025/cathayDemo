package com.example.demo2.model.repository;

import com.example.demo2.model.entity.Child;
import com.example.demo2.model.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ChildRepository extends JpaRepository<Child, UUID> {
    List<Child> findByCuuid(UUID uuid);

    Child findByCid(String cId);
}
