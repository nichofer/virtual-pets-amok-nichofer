package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MenuItems.introduction();
        MenuItems.instructions();

        VirtualPetShelter myShelter = new VirtualPetShelter();
        myShelter.admit(new OrganicDog("Dagwood", "Dog - Ain't nothing but an old hound dog"));
        myShelter.admit(new OrganicCat("Elroy", "Cat - Misses Jetson"));
        myShelter.admit(new RoboticDog("Riley", "Dog - Loves to hunt moles"));
        myShelter.admit(new RoboticCat("Mae", "Cat - Loves to cuddle"));

        Scanner input = new Scanner(System.in);
        String userInput;
        String petName;

        do {
            myShelter.showPetInfo();
            System.out.println("What would you like to do? Press 0 for instructions.");
            userInput = input.nextLine();

            if (!userInput.matches("^[0-9]|10$")) {
                System.out.println("You have entered an invalid entry. Please try again.");
                continue;
            }

            switch (userInput) {
                case "0":
                    MenuItems.instructions();
                    break;
                case "1":
                    myShelter.feedAllPets();
                    break;
                case "2":
                    myShelter.waterAllPets();
                    break;
                case "3":
                    System.out.println("Here is a brief description of the animals available for playtime: ");
                    myShelter.showPetTypeDesc();
                    System.out.println("Which pet would you like to play with today? Please enter the pet's name.");
                    petName = input.nextLine();
                    while (!myShelter.doesPetExistInShelter(petName)) {
                        System.out.println("Sorry, that pet is not available for playtime. Please enter another pet's name.");
                        petName = input.nextLine();
                    }
                    myShelter.playWithPet(petName);
                    break;
                case "4":
                    myShelter.walkDogs();
                    break;
                case "5":
                    System.out.println("Here is a brief description of the animals available for adoption: ");
                    myShelter.showPetTypeDesc();
                    System.out.println("Which pet would you like to adopt today? Please enter the pet's name.");
                    petName = input.nextLine();
                    while (!myShelter.doesPetExistInShelter(petName)) {
                        System.out.println("Sorry, that pet is not available for adoption. Please enter another pet's name.");
                        petName = input.nextLine();
                    }
                    myShelter.adopt(petName);
                    break;
                case "6":
                    System.out.println("Enter the name of the pet being brought in today: ");
                    petName = input.nextLine();
                    System.out.println("What type of animal is " + petName + "?\n 1 - Organic Dog\n 2 - Organic Cat\n 3 - Robotic Dog\n 4 - Robotic Cat");
                    String petType = input.nextLine();
                    System.out.println("Please provide a brief description of " + petName + ":");
                    String petDesc = input.nextLine();
                    String petTypeDesc = petType + " - " + petDesc;
                    if (petType.equals("1")) {
                        myShelter.admit(new OrganicDog(petName, petTypeDesc));
                    } else if (petType.equals("2")) {
                        myShelter.admit(new OrganicCat(petName, petTypeDesc));
                    } else if (petType.equals("3")) {
                        myShelter.admit(new RoboticDog(petName, petTypeDesc));
                    } else if (petType.equals("4")) {
                        myShelter.admit(new RoboticCat(petName, petTypeDesc));
                    }
                    break;
                case "7":
                    myShelter.oilRoboticPets();
                    break;
                case "8":
                    myShelter.cleanCages();
                    break;
                case "9":
                    myShelter.cleanLitterBox();
                    break;
            }
            myShelter.tick();
            myShelter.healthCheck();
            myShelter.getNumOfPets();
        } while (!userInput.equals("10"));
        System.out.println("Thanks for volunteering at Nicole's Pet Shelter Amok!");
    }
}