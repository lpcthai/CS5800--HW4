import org.junit.Test;
import static org.junit.Assert.*;

public class ProteinFactoryTest {

    @Test
    public void testProteinVegan() {
        ProteinFactory factory = ProteinFactory.getInstance();
        Protein protein = factory.create("Vegan");
        assertNotNull(protein);
        assertEquals("Protein: TOFU", protein.toString());
    }

    @Test
    public void testProteinNutAllergy() {
        ProteinFactory factory = ProteinFactory.getInstance();
        Protein protein = factory.create("Nut Allergy");
        assertNotNull(protein);
        assertTrue(protein.toString().equals("Protein: FISH") ||
                protein.toString().equals("Protein: CHICKEN") ||
                protein.toString().equals("Protein: BEEF"));
    }

    @Test
    public void testProteinNoRestriction() {
        ProteinFactory factory = ProteinFactory.getInstance();
        Protein protein = factory.create("No Restriction");
        assertNotNull(protein);

        assertTrue(protein.toString().equals("Protein: FISH") ||
                protein.toString().equals("Protein: CHICKEN") ||
                protein.toString().equals("Protein: BEEF") ||
                protein.toString().equals("Protein: TOFU"));
    }


}
