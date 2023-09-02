package com.wcci.virtualPetAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.wcci.virtualPetAPI.entity.OrganicDog;
import com.wcci.virtualPetAPI.repository.OrganicDogRepository;

@Service
public class OrganicDogService {

  @Autowired
  private OrganicDogRepository organicDogRepository;

  public void addOrganicDog(OrganicDog organicDog) {
    this.organicDogRepository.save(organicDog);
  }

  public List<OrganicDog> getAllOrganicDogs() {
    return this.organicDogRepository.findAll();
  }

  public void updateOrganicDog(long id, OrganicDog updatedOrganicDog) {
    OrganicDog existingOrganicDog = this.organicDogRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
            "Virtual pet with id " + id + " was not found!"));

    existingOrganicDog.setName(updatedOrganicDog.getName());
    existingOrganicDog.setDescription(updatedOrganicDog.getDescription());
    existingOrganicDog.setHealth(updatedOrganicDog.getHealth());
    existingOrganicDog.setHappiness(updatedOrganicDog.getHappiness());
    this.organicDogRepository.save(existingOrganicDog);
  }
}
