import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class CarbFactoryTest {

    @Test
    public void testCarbNoRestriction() {
        CarbFactory factory = CarbFactory.getInstance();
        Carb carb = factory.create("No Restriction");
        assertNotNull(carb);
        assertTrue(carb.toString().contains("Carb:"));
    }

    @Test
    public void testCarbPaleo() {
        CarbFactory factory = CarbFactory.getInstance();
        Carb carb = factory.create("Paleo");
        assertEquals("Carb: PISTACHIO", carb.toString());
    }

    @Test
    public void testNutAllergyCarb() {
        CarbFactory factory = CarbFactory.getInstance();
        Carb carb = factory.create("Nut Allergy");
        List<Carb.Type> availableCarbs = Arrays.asList(Carb.Type.BREAD, Carb.Type.LENTILS);
        assertTrue(availableCarbs.contains(carb.getType()));
    }
}
