import org.junit.Test;
import static org.junit.Assert.*;

public class MacronutrientFactoryTest {

    @Test
    public void testInstance() {
        MacronutrientFactory factory1 = MacronutrientFactory.getInstance();
        MacronutrientFactory factory2 = MacronutrientFactory.getInstance();
        assertSame(factory1, factory2);
    }

    @Test
    public void testCarbFactory() {
        MacronutrientFactory factory = MacronutrientFactory.getInstance();
        CarbFactory carbFactory = factory.CarbFactory();
        assertNotNull(carbFactory);
        assertSame(carbFactory, CarbFactory.getInstance());
    }

    @Test
    public void testProteinFactory() {
        MacronutrientFactory factory = MacronutrientFactory.getInstance();
        ProteinFactory proteinFactory = factory.ProteinFactory();
        assertNotNull(proteinFactory);
        assertSame(proteinFactory, ProteinFactory.getInstance());
    }

    @Test
    public void testFatFactory() {
        MacronutrientFactory factory = MacronutrientFactory.getInstance();
        FatFactory fatFactory = factory.FatFactory();
        assertNotNull(fatFactory);
        assertSame(fatFactory, FatFactory.getInstance());
    }
}
