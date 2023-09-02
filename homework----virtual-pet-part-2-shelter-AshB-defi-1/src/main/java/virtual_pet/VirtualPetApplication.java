package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to VirtualPet! Please name your new pet: ");
        String petName = scanner.nextLine();

        VirtualPet pet = new VirtualPet(petName);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println(petName + " the Virtual Pet");
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Thirst: " + pet.getThirst());
            System.out.println("Boredom: " + pet.getBoredom());
            System.out.println("Sleepiness: " + pet.getSleepiness());
            System.out.println("What do you want to do?");

            
            System.out.println("1. Feed " + petName);
            System.out.println("2. Give water to " + petName);
            System.out.println("3. Play with " + petName);
            System.out.println("4. Put " + petName + " to sleep");
            System.out.println("5. Do nothing");
            System.out.println("6. Exit game");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (pet.feed()) {
                        System.out.println("You fed " + petName + ".");
                    } else {
                        System.out.println(petName + " is not hungry.");
                    }
                    break;
                case 2:
                    if (pet.giveWater()) {
                        System.out.println("You gave water to " + petName + ".");
                    } else {
                        System.out.println(petName + " is not thirsty.");
                    }
                    break;
                case 3:
                    if (pet.play()) {
                        System.out.println("You played with " + petName + ".");
                    } else {
                        System.out.println(petName + " doesn't want to play.");
                    }
                    break;
                case 4:
                    if (pet.putToSleep()) {
                        System.out.println("You put " + petName + " to sleep.");
                    } else {
                        System.out.println(petName + " doesn't want to sleep.");
                    }
                    break;
                case 5:
                    System.out.println("You do nothing.");
                    break;
                case 6:
                    System.out.println("Exiting game...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid action.");
            }

            pet.tick();

            if (pet.isSick()) {
                System.out.println(petName + " is feeling sick! Please take better care of your pet.");
                isRunning = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for playing VirtualPet!");
    }
}
