package com.example.demo2.model.repository;

import com.example.demo2.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PetRepository extends JpaRepository<Pet, UUID> {
}
