import org.junit.Test;
import static org.junit.Assert.*;

public class CarbTest {

    @Test
    public void CarbTest() {
       Carb carb = new Carb(Carb.Type.PISTACHIO);
        assertEquals(Carb.Type.PISTACHIO, carb.getType());
    }

    @Test
    public void testString() {
        Carb carb = new Carb(Carb.Type.CHEESE);
        assertEquals("Carb: CHEESE", carb.toString());
    }
}
