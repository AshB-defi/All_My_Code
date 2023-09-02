package com.wcci.virtualPetAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wcci.virtualPetAPI.entity.OrganicDog;
import com.wcci.virtualPetAPI.service.OrganicDogService;

@RestController
public class OrganicDogController {

  @Autowired
  OrganicDogService organicDogService;

  @PostMapping("/addOrganicDog")
  public void addOrganicDog(@RequestBody OrganicDog organicDog) {
    this.organicDogService.addOrganicDog(organicDog);
  }

  @GetMapping("/organicDogs")
  public List<OrganicDog> findAllOrganicDogs() {
    return this.organicDogService.getAllOrganicDogs();
  }

  @PutMapping("/organicDog/{id}")
  public void modifyOrganicDog(@PathVariable long id, @RequestBody OrganicDog updatedPet) {
    this.organicDogService.updateOrganicDog(id, updatedPet);
  }
}
