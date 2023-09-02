package com.wcci.virtualPetAPI.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "organic_dog")
public class OrganicDog extends OrganicPet {
    private boolean waste = true;
    private boolean cageCleanliness = true;

    @ManyToOne
    private VirtualPetShelter shelter;

    public OrganicDog() {
    }

    public OrganicDog(String name, long id) {
        super(name, id);
        this.setDescription("Organic Dog");
    }

    public OrganicDog(String name, long id, boolean happiness, boolean hunger, boolean thirst, boolean tiredness,
            boolean boredom,
            boolean sickness) {
        super(name, id, happiness, hunger, thirst, tiredness, boredom, sickness);
        this.setDescription("Organic Dog");
    }

    public VirtualPetShelter getShelter() {
        return shelter;
    }

    public void setShelter(VirtualPetShelter shelter) {
        this.shelter = shelter;
    }

    public boolean getWaste() {
        return this.waste;
    }

    public void setWaste(boolean waste) {
        this.waste = waste;
    }

    public boolean getCageCleanliness() {
        return this.cageCleanliness;
    }

    public void setCageCleanliness(boolean cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }
}
