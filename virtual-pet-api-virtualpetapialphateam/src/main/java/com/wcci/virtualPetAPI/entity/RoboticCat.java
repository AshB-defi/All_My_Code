package com.wcci.virtualPetAPI.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "robotic_cat")
public class RoboticCat extends RoboticPet {


    @ManyToOne
    private VirtualPetShelter shelter;

    public RoboticCat() {
    }

    public RoboticCat(String name, long id) {
        super(name, id);
        this.setDescription("Robotic Cat");
    }

    public RoboticCat(String name, long id, boolean happiness, boolean oilLevel, boolean maintenance) {
        super(name, id, happiness, oilLevel, maintenance);
        this.setDescription("Robotic Cat");
    }

    public VirtualPetShelter getShelter() {
        return shelter;
    }

    public void setShelter(VirtualPetShelter shelter) {
        this.shelter = shelter;
    }
}
