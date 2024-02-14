package com.example.demo2.model.repository;

import com.example.demo2.model.user.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AdminRepostory extends JpaRepository<Admin, UUID> {
    Admin findByAdminAccount(String account);
}
