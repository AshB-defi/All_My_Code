package com.wcci.virtualPetAPI.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wcci.virtualPetAPI.entity.OrganicCat;
import com.wcci.virtualPetAPI.service.OrganicCatService;

@RestController
public class OrganicCatController {

    @Autowired
    OrganicCatService organicCatService;
    
    @PostMapping("/addOrganicCat")
    public void addOrganicCat(@RequestBody OrganicCat organicCat) {
        this.organicCatService.addOrganicCat(organicCat);
    }
    @GetMapping("/organicCats")
    public List<OrganicCat> findAllOrganicCats() {
        return this.organicCatService.getAllOrganicCats();
    }
    @PutMapping("/organicCat/{id}")
    public void modifyOrganicCat(@PathVariable long id, @RequestBody OrganicCat updatedPet) {
        this.organicCatService.updateOrganicCat(id, updatedPet);
    }
}
