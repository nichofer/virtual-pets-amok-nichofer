package pets_amok;

import java.util.Random;

public class OrganicCat extends VirtualPet implements OrganicPetInterface {

    private int hunger;
    private int thirst;
    private int amountOfWaste;

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getAmountOfWaste() {
        return amountOfWaste;
    }

    @Override
    public void feedPet() {
        if (hunger != 0) {
            hunger--;
        }
        happiness++;
        thirst++;
        amountOfWaste++;
    }

    @Override
    public void givePetWater() {
        if (thirst != 0) {
            thirst--;
        }
        hunger++;
        amountOfWaste++;
    }

    public void cleanLitterBox() {
        amountOfWaste = 0;
        happiness++;
    }

    @Override
    public void tick() {
        super.tick();
        Random rand = new Random();
        int n = rand.nextInt(4);
        if (n == 1) {
            hunger++;
        } else if (n == 2) {
            thirst++;
        } else if (n == 3) {
            amountOfWaste++;
        }
        if (hunger > 10 || thirst > 10 || amountOfWaste > 10) {
            isHealthy = false;
        }
    }

    public OrganicCat(String name, String typeDesc) {
        super(name, typeDesc);
        this.hunger = 5;
        this.thirst = 5;
        this.amountOfWaste = amountOfWaste;
    }

    @Override
    public String petInfo() {
        return super.petInfo() + "|" + hunger + "|" + thirst + "|" + amountOfWaste;
    }
}
