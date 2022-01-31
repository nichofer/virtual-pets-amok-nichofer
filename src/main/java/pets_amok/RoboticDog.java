package pets_amok;

public class RoboticDog extends VirtualPet implements RoboticPetInterface, AllDogsInterface {

    private int oilLevel;

    public int getOilLevel() {
        return oilLevel;
    }

    @Override
    public void oilRoboticPets() {
        happiness++;
        oilLevel++;
        if (oilLevel > 10) {
            isHealthy = false;
        }
    }

    @Override
    public void walk() {
        happiness++;
        oilLevel--;
        if (boredom > 2) {
            boredom = boredom - 2;
        } else {
            boredom = 0;
        }
    }

    public RoboticDog(String name, String typeDesc) {
        super(name, typeDesc);
        this.oilLevel = 5;
    }

    @Override
    public String petInfo() {
        return super.petInfo() +  "|" + oilLevel;
    }

}
