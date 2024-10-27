import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MealTest {
    @Test
    public void testMeal() {
        Carb carb = new Carb(Carb.Type.BREAD);
        Protein protein = new Protein(Protein.Type.CHICKEN);
        Fat fat = new Fat(Fat.Type.AVOCADO);
        Meal meal = new Meal(carb, protein, fat);

        assertNotNull(meal);
        assertEquals("Carb: BREAD, Protein: CHICKEN, Fat: AVOCADO", meal.toString());
    }
}