package com.wcci.virtualPetAPI.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "robotic_dog")
public class RoboticDog extends RoboticPet {

    @ManyToOne
    private VirtualPetShelter shelter;

    public RoboticDog() {
    }

    public RoboticDog(String name, long id) {
        super(name, id);
        this.setDescription("Robotic Dog");
    }

    public RoboticDog(String name, long id, boolean happiness, boolean oilLevel, boolean maintenance) {
        super(name, id, happiness, oilLevel, maintenance);
        this.setDescription("Robotic Dog");
    }

    public VirtualPetShelter getShelter() {
        return shelter;
    }

    public void setShelter(VirtualPetShelter shelter) {
        this.shelter = shelter;
    }
}