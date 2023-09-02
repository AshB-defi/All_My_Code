import java.util.*;

public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public void removePet(String petName) {
        pets.remove(petName);
    }

    public Collection<VirtualPet> getPets() {
        return pets.values();
    }

    public void feedPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();
        }
    }

    public void waterPets() {
        for (VirtualPet pet : pets.values()) {
            pet.giveWater();
        }
    }

    public void playWithPet(String petName) {
        if (pets.containsKey(petName)) {
            pets.get(petName).play();
        }
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }
}

