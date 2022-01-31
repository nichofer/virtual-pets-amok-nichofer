package pets_amok;

import java.util.Random;

public abstract class VirtualPet {

    private String name;
    private String typeDesc;
    protected int boredom;
    protected int happiness;
    protected boolean isHealthy = true;

    public String getName() {
        return name;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public int getBoredom() {
        return boredom;
    }
    public int getHappiness() {
        return happiness;
    }

    public boolean getHealth() {
        return isHealthy;
    }

    public void playWithPet() {
        if (boredom > 2) {
            boredom = boredom - 2;
        } else {
            boredom = 0;
        }
        happiness++;
    }

    public void tick() {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 1) {
            boredom++;
        } else {
            happiness--;
        }
        if (boredom > 10 || happiness < 5) {
            isHealthy = false;
        }
    }

    public VirtualPet(String name, String typeDesc) {
        this.name = name;
        this.typeDesc = typeDesc;
        this.boredom = 0;
        this.happiness = 10;
        this.isHealthy = true;
    }

    public String petInfo() {
        return name +  "|" + boredom + "|" + happiness;
    }
}