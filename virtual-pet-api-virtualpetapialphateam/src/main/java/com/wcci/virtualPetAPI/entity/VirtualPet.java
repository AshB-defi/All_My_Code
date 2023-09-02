package com.wcci.virtualPetAPI.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"pet\"")
public abstract class VirtualPet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private boolean health;
    private boolean happiness;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shelter_id")
    private VirtualPetShelter shelter;

    public VirtualPet() {
    }

    public VirtualPet(String name, long id) {
        this.id = id;
        this.name = name;
        this.happiness = true;
        this.health = true;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getHealth() {
        return this.health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public boolean getHappiness() {
        return this.happiness;
    }

    public void setHappiness(boolean happiness) {
        this.happiness = happiness;
    }

    public VirtualPetShelter getShelter() {
        return shelter;
    }

    public void setShelter(VirtualPetShelter shelter) {
        this.shelter = shelter;
    }

    @Override
    public String toString() {
        return "VirtualPet [id=" + id + ", name=" + name + ", description=" + description + ", health=" + health
                + ", happiness=" + happiness + "]";
    }
}
