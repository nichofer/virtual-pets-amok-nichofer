package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetTest {

    OrganicDog underTest1 = new OrganicDog("","");
    OrganicCat underTest2 = new OrganicCat("","");

    @Test
    public void shouldAllowForWalkingOfOrganicDog(){
        underTest1.walk();
        int check = underTest1.getHappiness();
        assertEquals(11, check);
    }

    @Test
    public void shouldFeedOrganicPet() {
        underTest1.feedPet();
        underTest2.feedPet();
        int dogHunger = underTest1.getHunger();
        int catHunger = underTest2.getHunger();
        assertEquals(0, dogHunger);
        assertEquals(0, catHunger);
    }

    @Test
    public void shouldCleanOrganicDogCage(){
        underTest1.cleanCage();
        int check = underTest1.getAmountOfWaste();
        assertEquals(0, check);
    }

    @Test
    public void shouldCleanOrganicCatLitterBox(){
        underTest2.cleanLitterBox();
        int check = underTest2.getAmountOfWaste();
        assertEquals(0,check);
    }

}
