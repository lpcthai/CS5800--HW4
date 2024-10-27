import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class PizzaTest {
    PizzaBuilder pizzaBuilder;

   @Test
    public void testEat() {
        List<Pizza.Topping> toppings = Arrays.asList(
                Pizza.Topping.PEPPERONI,
                Pizza.Topping.EXTRA_CHEESE);
                Pizza pizza = new Pizza(Pizza.Chain.DOMINOS,
                Pizza.Size.SMALL, toppings);

        String expectedOutput = String.join(
                System.lineSeparator(),
                "Pizza's chain: DOMINOS",
                "Pizza's size: SMALL",
                "Toppings: PEPPERONI, EXTRA_CHEESE",
                ""
        );
        ByteArrayOutputStream toString;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        pizza.eat();
        System.setOut(System.out);
        assertEquals(expectedOutput, outputStream.toString());
    }

}
