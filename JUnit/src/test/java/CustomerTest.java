import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CustomerTest {

    @Test
    public void CustomerTest() {
        Customer customer = new Customer("Celine", "No Restriction");
        assertEquals("Celine", customer.getName());
        assertEquals("No Restriction", customer.getDietPlan());
    }

    @Test
    public void testDisplayInfo() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);
        Customer customer = new Customer("Liam", "Vegan");
        customer.displayInfo();
        System.setOut(originalOut);
        String expectedOutput = customer.toString();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
