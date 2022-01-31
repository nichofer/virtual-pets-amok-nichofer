package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {

    OrganicCat underTest = new OrganicCat("Belle", "Cat");

    @Test
    public void shouldReturnVirtualPetName() {
        String actualName = underTest.getName();
        assertEquals("Belle", actualName);
    }

    @Test
    public void shouldReturnPetNameAndTypeDesc() {
        String actualName = underTest.getName();
        String actualType = underTest.getTypeDesc();
        assertEquals("Belle", actualName);
        assertEquals("Cat", actualType);
    }


    @Test
    public void shouldReturnPetBoredomLevel() {
        int boredomLevel = underTest.getBoredom();
        assertEquals(0, boredomLevel);
    }

    @Test
    public void shouldPlayWithPet() {
        underTest.playWithPet();
        int boredomLevel = underTest.getBoredom();
        assertEquals(0, boredomLevel);
    }

    @Test
    public void shouldTickPet() {
        underTest.tick();
        assertTrue(underTest.getBoredom()>=1);
    }
}
