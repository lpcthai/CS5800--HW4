import org.junit.Test;
import static org.junit.Assert.*;

public class MacroTest {

    @Test
    public void testCarbFactory() {
        Macro macroFactory = new Macro();
        CarbFactory carbFactory1 = macroFactory.CarbFactory();
        CarbFactory carbFactory2 = CarbFactory.getInstance();
        assertSame(carbFactory1, carbFactory2);
    }

    @Test
    public void testProteinFactory() {
        Macro macroFactory = new Macro();
        ProteinFactory proteinFactory1 = macroFactory.ProteinFactory();
        ProteinFactory proteinFactory2 = ProteinFactory.getInstance();
        assertSame(proteinFactory1, proteinFactory2);
    }

    @Test
    public void testFatFactory() {
        Macro macroFactory = new Macro();
        FatFactory fatFactory1 = macroFactory.FatFactory();
        FatFactory fatFactory2 = FatFactory.getInstance();
        assertSame(fatFactory1, fatFactory2);
    }
}
