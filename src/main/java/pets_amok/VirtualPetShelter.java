package pets_amok;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new ConcurrentHashMap<>();

    public void admit(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
        System.out.println(petToAdd.getName() + " has been accepted into Nicole's Pet Shelter Amok.");
    }

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    public boolean doesPetExistInShelter(String petName) {
        if (pets.containsKey(petName)) {
            return true;
        } else {
            return false;
        }
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void getNumOfPets() {
        if (pets.size() == 0) {
            System.out.println("The shelter is now empty. Thank you for volunteering at Nicole's Pet Shelter Amok!");
            System.exit(0);
        }
    }

    public void adopt(String petToRemove) {
        pets.remove(petToRemove);
        System.out.println("Thank you for adopting " + petToRemove + ".");
    }

    public void playWithPet(String petName) {
        pets.get(petName).playWithPet();
        System.out.println(petName + " really enjoyed playing!");
    }

    public void walkDogs(){
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof AllDogsInterface) {
                ((AllDogsInterface) pet).walk();
            }
        }
        System.out.println("You have walked the dogs.");
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicPetInterface) {
                ((OrganicPetInterface) pet).feedPet();
            }
        }
        System.out.println("You have fed the organic pets.");
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicPetInterface) {
                ((OrganicPetInterface) pet).givePetWater();
            }
        }
        System.out.println("You have filled the organic pets water.");
    }

    public void cleanLitterBox() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicCat) {
                ((OrganicCat) pet).cleanLitterBox();
            }
        }
        System.out.println("You have cleaned the litter box.");
     }

    public void cleanCages() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).cleanCage();
            }
        }
        System.out.println("You have cleaned the cages.");
    }

    public void oilRoboticPets() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboticPetInterface) {
                ((RoboticPetInterface) pet).oilRoboticPets();
            }
        }
        System.out.println("You have oiled the robotic pets.");
    }

    public void healthCheck() {
        for (VirtualPet pet : pets.values()) {
            if (pet.getHealth()) {
                continue;
            } else {
                System.out.println(pet.getName() + " is unwell and has been removed from the shelter.");
                pets.remove(pet.getName());
            }
        }
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }

    public void showPetInfo() {
        System.out.println(" ");
        System.out.println("Animals currently being sheltered and their status: ");
        System.out.println("---------------------Organic Dogs-------------------");
        System.out.println("Name" + "|Boredom" + "|Happiness" + "|Hunger" + "|Thirst" + "|Waste");
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicDog) {
                System.out.println(pet.petInfo());
            }
        }
        System.out.println("---------------------Organic Cats-------------------");
        System.out.println("Name" + "|Boredom" + "|Happiness" + "|Hunger" + "|Thirst" + "|Waste");
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicCat) {
                System.out.println(pet.petInfo());
            }
        }
        System.out.println("---------------------Robotic Dogs-------------------");
        System.out.println("Name" + "|Boredom" + "|Happiness" + "|Oil Level");
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboticDog) {
                System.out.println(pet.petInfo());
            }
        }
        System.out.println("---------------------Robotic Cats-------------------");
        System.out.println("Name" + "|Boredom" + "|Happiness" + "|Oil Level");
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboticCat) {
                System.out.println(pet.petInfo());
            }
        }
        System.out.println(" ");
    }

    public void showPetTypeDesc() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(pet.getName() + " - " + pet.getTypeDesc());
        }
        System.out.println(" ");
    }
}
