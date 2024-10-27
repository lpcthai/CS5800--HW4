import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaBuilderTest {
    private PizzaBuilder pizzaBuilder;
    @BeforeEach
    public void setUp() {
        pizzaBuilder = new PizzaBuilder(Pizza.Chain.PIZZA_HUT);
    }

    @Test
    public void testSize() {
        Pizza pizza = pizzaBuilder.size(Pizza.Size.MEDIUM).build();
        assertEquals(Pizza.Size.MEDIUM, pizza.getSize(), "The pizza size should be MEDIUM.");
    }

    @Test
    public void testAddTopping() {
        Pizza pizza = pizzaBuilder.size(Pizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .build();

        List<Pizza.Topping> toppings = pizza.getToppings();
        assertTrue(toppings.contains(Pizza.Topping.PEPPERONI), "The pizza should contain Pepperoni.");
        assertTrue(toppings.contains(Pizza.Topping.MUSHROOMS), "The pizza should contain Mushrooms.");
        assertEquals(2, toppings.size(), "The pizza should have 2 toppings.");
    }

    @Test
    public void testBuild() {
        Pizza pizza = pizzaBuilder.size(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.BEEF)
                .build();

        assertNotNull(pizza, "The pizza should not be null.");
        assertEquals(Pizza.Chain.PIZZA_HUT, pizza.getChain(), "The pizza chain should be Pizza Hut.");
        assertEquals(Pizza.Size.LARGE, pizza.getSize(), "The pizza size should be LARGE.");
        assertTrue(pizza.getToppings().contains(Pizza.Topping.BEEF), "The pizza should contain Beef.");
    }

    @Test
    public void testEat() {
        Pizza pizza = pizzaBuilder.size(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.OLIVES)
                .build();
        pizza.eat();
    }
}
