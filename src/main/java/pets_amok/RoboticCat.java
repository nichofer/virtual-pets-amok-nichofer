package pets_amok;

public class RoboticCat extends VirtualPet implements RoboticPetInterface {

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

    public RoboticCat(String name, String typeDesc) {
        super(name, typeDesc);
        this.oilLevel = 5;
    }

    @Override
    public String petInfo() {
        return super.petInfo() +  "|" + oilLevel;
    }
}
