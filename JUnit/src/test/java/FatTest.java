import org.junit.Test;
import static org.junit.Assert.*;

public class FatTest {

    @Test
    public void FatTest() {
        Fat fat = new Fat(Fat.Type.AVOCADO);
        assertEquals(Fat.Type.AVOCADO, fat.getType());
    }

    @Test
    public void testString() {
        Fat fat = new Fat(Fat.Type.SOUR_CREAM);
        assertEquals("Fat: SOUR_CREAM", fat.toString());
    }
}
