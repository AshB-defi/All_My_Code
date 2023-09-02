package pets_amok;

import java.util.*;


public class VirtualPetShelter {
    private Map<String, VirtualPet> pets;
    private VirtualPet roboticDog;
    private VirtualPet roboticCat;

    public VirtualPetShelter() {
        this.pets = new HashMap<>();
    }

    public Collection<VirtualPet> getPets() {
        return this.pets.values();
    }

    public void admit(OrganicDog dog) {
        this.pets.put(dog.getName(), dog);
    }

    public void admit(OrganicCat cat) {
        this.pets.put(cat.getName(), cat);
    }
    
    public void admit(RoboticDog dog) {
        this.pets.put(roboticDog.getName(), roboticDog);
    }
    
    public void admit(RoboticCat cat) {
        this.pets.put(roboticCat.getName(), roboticCat);
    
    }
    public void adopt(String petName) {
        this.pets.remove(petName);
    }

    public void feedPets() {
        for (VirtualPet pet : this.pets.values()) {
            pet.feed();
        }
    }

    public void waterPets() {
        for (VirtualPet pet : this.pets.values()) {
            pet.giveWater();
        }
    }

    public void playWithPet(String petName) {
        if (this.pets.containsKey(petName)) {
            this.pets.get(petName).play();
        }
    }

    public void tick() {
        for (VirtualPet pet : this.pets.values()) {
            pet.tick();
        }
    }

    public void oilRoboticPets() {
        for (VirtualPet pet : this.pets.values()) {
            if (pet instanceof Robotic) {
                ((Robotic) pet).oilMaintenance();
            }
        }
    }

    public void cleanDogCages() {
        for (VirtualPet pet : this.pets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            } else if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).cleanCage();
            }
        }
    }

    public void walkDogs() {
        for (VirtualPet pet : this.pets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).walk();
            } else if (pet instanceof RoboticDog) {
                ((RoboticDog) pet).walk();
            }
        }
    }

    public void cleanLitterbox() {
        for (VirtualPet pet : this.pets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterbox();
            }
        }
    }

    public void admit(Robotic roboticPet) {
    }

    public void oilRobotic() {
    }

    public void cleanLitterBox() {
    }
}


