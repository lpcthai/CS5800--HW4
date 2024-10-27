import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class FatFactoryTest {

    @Test
    public void testFatNoRestriction() {
        FatFactory factory = FatFactory.getInstance();
        Fat fat = factory.create("No Restriction");
        assertNotNull(fat);
        assertTrue(fat.toString().startsWith("Fat:"));
        String fatType = fat.getType().name();
        assertTrue(Arrays.asList("AVOCADO", "SOUR_CREAM", "TUNA", "PEANUTS").contains(fatType));
    }

    @Test
    public void testFatPaleo() {
        FatFactory factory = FatFactory.getInstance();
        Fat fat = factory.create("Paleo");
        assertNotNull(fat);
        assertTrue(fat.toString().startsWith("Fat:"));
        String fatType = fat.getType().name();
        assertTrue(Arrays.asList("AVOCADO", "TUNA", "PEANUTS").contains(fatType));
    }

    @Test
    public void testFatVegan() {
        FatFactory factory = FatFactory.getInstance();
        Fat fat = factory.create("Vegan");
        assertNotNull(fat);
        assertTrue(fat.toString().startsWith("Fat:"));

        System.out.println(" The Fat type is : " + fat.getType());

        String fatType = fat.getType().name();
        assertTrue(Arrays.asList("AVOCADO", "TUNA").contains(fatType));
    }


    @Test
    public void testFatNutAllergy() {
        FatFactory factory = FatFactory.getInstance();
        Fat fat = factory.create("Nut Allergy");
        assertNotNull(fat);
        assertTrue(fat.toString().startsWith("Fat:"));
        String fatType = fat.getType().name();
        assertTrue(Arrays.asList("AVOCADO", "SOUR_CREAM", "TUNA").contains(fatType));
    }

    @Test
    public void testFatInvalidDietPlan() {
        FatFactory factory = FatFactory.getInstance();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.create("Invalid Diet Plan");
        });

        assertEquals("Invalid diet plan: Invalid Diet Plan", exception.getMessage());
    }
}
