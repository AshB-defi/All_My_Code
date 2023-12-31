package com.wcci.virtualPetAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcci.virtualPetAPI.entity.VirtualPetShelter;

@Repository
public interface VirtualPetShelterRepository extends JpaRepository<VirtualPetShelter, Long> {

}
