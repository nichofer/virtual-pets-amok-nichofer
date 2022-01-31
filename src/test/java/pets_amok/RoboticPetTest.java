package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticPetTest {

    RoboticDog underTest1 = new RoboticDog("","");
    RoboticCat underTest2 = new RoboticCat("","");


    @Test
    public void shouldAllowForOilingRoboticPets(){
        underTest1.oilRoboticPets();
        underTest2.oilRoboticPets();
        int oilCheck1 = underTest1.getOilLevel();
        int oilCheck2 = underTest2.getOilLevel();
        assertEquals(6, oilCheck1);
        assertEquals(6, oilCheck2);
    }

    @Test
    public void shouldAllowForWalkingOfRoboticDog(){
        underTest1.walk();
        int check = underTest1.getHappiness();
        assertEquals(11, check);
    }
}
