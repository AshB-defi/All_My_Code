package pets_amok;

import java.util.*;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();
    
        shelter.admit(new OrganicDog("OrganicDog Ash"));
        shelter.admit(new OrganicCat("OrganicCat John"));
        shelter.admit(new RoboticDog("RoboticDog Dre"));
        shelter.admit(new RoboticCat("RoboticCat Andy"));
    
        while (true) {
            System.out.println("Welcome to Ash B's Virtual Pet Shelter!");
            System.out.println("This is the status of your pets:\n");
            System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t|Health\t|Happiness");
            System.out.println("--------|-------|-------|-------|-------|---------");
            for (VirtualPet pet : shelter.getPets()) {
                System.out.println(pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getBoredom() 
                + "\t|" + pet.getHealth() + "\t|" + pet.getHappiness());
            }
    
            System.out.println("\nWhat would you like to do next?\n");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Oil all the roboticPets");
            System.out.println("7. Clean all Dogs cages");
            System.out.println("8. Clean all Cats litter boxes");
            System.out.println("9. Walk all the Dogs");
            System.out.println("10. Quit");
    
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    shelter.feedPets();
                    break;
                case 2:
                    shelter.waterPets();
                    break;
                case 3:
                    System.out.println("Ok, so you'd like to play with a pet. Please choose one:");
                    for (VirtualPet pet : shelter.getPets()) {
                        System.out.println("[" + pet.getName() + "]");
                    }
                    String petName = scanner.nextLine();
                    if (shelter.getPets().stream().anyMatch(pet -> pet.getName().equals(petName))) {
                        shelter.playWithPet(petName);
                        System.out.println("Ok, you play with " + petName + ".");
                    } else {
                        System.out.println("Pet not found. Please make sure you have the correct name.");
                    }
                    break;
                case 4:
                    System.out.println("Which pet do you want to adopt?");
                    String adoptPetName = scanner.nextLine();
                    shelter.adopt(adoptPetName);
                    break;
                case 5:
                    System.out.println("What's the name of the pet you're admitting?");
                    String newPetName = scanner.nextLine();
                    System.out.println("What type of pet is it? (OrganicDog, OrganicCat, RoboticDog, RoboticCat)");
                    String petType = scanner.nextLine();
                    switch (petType) {
                        case "OrganicDog":
                            shelter.admit(new OrganicDog(newPetName));
                            break;
                        case "OrganicCat":
                            shelter.admit(new OrganicCat(newPetName));
                            break;
                        case "RoboticDog":
                            shelter.admit(new RoboticDog(newPetName));
                            break;
                        case "RoboticCat":
                            shelter.admit(new RoboticCat(newPetName));
                        default:
                            System.out.println("Invalid pet type. Pet not admitted.");
                            break;
                    }
                    break;
                case 6:
                    shelter.oilRoboticPets();
                    System.out.println("You oiled all the roboticPets.");
                    break;
                case 7:
                    shelter.cleanDogCages();
                    System.out.println("You cleaned all the Dogs cages.");
                    break;
                case 8:
                    shelter.cleanLitterbox();
                    System.out.println("You cleaned all the organicCats litter boxes.");
                    break;
                case 9:
                    shelter.walkDogs();
                    System.out.println("You walked all the Dogs.");
                    break;
                case 10:
                    System.out.println("Thank you for using Ash B's Virtual Pet Shelter. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid action.");
            }
            shelter.tick();
        }
    }
}
