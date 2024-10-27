import org.junit.Test;
import static org.junit.Assert.*;

public class ProteinTest {

    @Test
    public void testProtein() {
        Protein protein = new Protein(Protein.Type.TOFU);
        assertEquals(Protein.Type.TOFU, protein.getType());
    }

    @Test
    public void testString() {
        Protein protein = new Protein(Protein.Type.FISH);
        assertEquals("Protein: FISH", protein.toString());
    }
}
