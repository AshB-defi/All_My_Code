package com.wcci.virtualPetAPI.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "organic_cat")
public class OrganicCat extends OrganicPet {
    private static boolean litterBox = true;

    @ManyToOne
    private VirtualPetShelter shelter;

    public OrganicCat() {
    }

    public OrganicCat(String name, long id) {
        super(name, id);
        this.setDescription("Organic Cat");
    }

    public OrganicCat(String name, long id, boolean happiness, boolean hunger, boolean thirst, boolean tiredness,
            boolean boredom, boolean sickness) {
        super(name, id, happiness, hunger, thirst, tiredness, boredom, sickness);
        this.setDescription("Organic Cat");
    }

    public VirtualPetShelter getShelter() {
        return shelter;
    }

    public void setShelter(VirtualPetShelter shelter) {
        this.shelter = shelter;
    }

    public static boolean getLitterBox() {
        return litterBox;
    }

    public static void setLitterBox(boolean newLitter) {
        litterBox = newLitter;
    }
}
