package com.wcci.virtualPetAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.wcci.virtualPetAPI.entity.OrganicCat;
import com.wcci.virtualPetAPI.repository.OrganicCatRepository;

@Service
public class OrganicCatService {

    @Autowired
    private OrganicCatRepository organicCatRepository;

    public void addOrganicCat(OrganicCat organicCat) {
        this.organicCatRepository.save(organicCat);
    }

    public List<OrganicCat> getAllOrganicCats() {
      return this.organicCatRepository.findAll();
  }

    public void updateOrganicCat(long id, OrganicCat updatedOrganicCat) {
        OrganicCat existingOrganicCat = this.organicCatRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Virtual pet with id " + id + " was not found!"));

        existingOrganicCat.setName(updatedOrganicCat.getName());
        existingOrganicCat.setDescription(updatedOrganicCat.getDescription());
        existingOrganicCat.setHealth(updatedOrganicCat.getHealth());
        existingOrganicCat.setHappiness(updatedOrganicCat.getHappiness());
        this.organicCatRepository.save(existingOrganicCat);
    }
}
