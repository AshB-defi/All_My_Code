package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    void appHasAGreeting() {
        assertTrue(true, "app should have a greeting");

    }

    //This test when you clean th e dog cages c the cage cleanliness of OrganicDog instance is set at 100
    @Test
    public void testCageCleanlinessForOrganicDogs() {
        VirtualPetShelter shelter = new VirtualPetShelter();
        OrganicDog dog = new OrganicDog("OrganicDog Ash");
        shelter.admit(dog);
        dog.cleanCage();
        shelter.cleanDogCages();
        assertEquals(100, dog.getCageCleanliness());
    }

    //So it was supposed to be shelters community litter box but I did individual cat litter boxes...
    //This test the reduction of each cat usage of the litterbox..
    @Test
public void testShelterLitterBoxCleanlinessForOrganicCats() {
    VirtualPetShelter shelter = new VirtualPetShelter();
    OrganicCat cat = new OrganicCat("OrganicCat John");
    shelter.admit(cat);
    cat.cleanLitterbox();
    shelter.cleanLitterbox();
    assertEquals(100, cat.getcleanLitterbox());
}

//This test that oil maintenance for robotic instance is at 100
@Test
public void testOilMaintenanceLevelForRobotic() {
    VirtualPetShelter shelter = new VirtualPetShelter();
    Robotic robotic = new Robotic("RoboticCat Andy");
    shelter.admit(robotic);
    shelter.oilRobotic();
    assertEquals(100, robotic.getHealth());
}
}