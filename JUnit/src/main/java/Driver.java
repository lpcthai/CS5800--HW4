import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Celine", "No Restriction"),
                new Customer("Yu", "Paleo"),
                new Customer("Liam", "Vegan"),
                new Customer("Chloe", "Nut Allergy"),
                new Customer("Katie", "Paleo"),
                new Customer("Timmy", "Vegan")
        );

        MacronutrientFactory factory = MacronutrientFactory.getInstance();
        CarbFactory carbFactory = factory.CarbFactory();
        FatFactory fatFactory = factory.FatFactory();
        ProteinFactory proteinFactory = factory.ProteinFactory();

        for (Customer customer : customers) {
            String name = customer.getName();
            String dietPlan = customer.getDietPlan();

            System.out.println("Customer's name: " + name + ", Diet Plan: " + dietPlan);
            try {
                Carb carb = carbFactory.create(dietPlan);
                Fat fat = fatFactory.create(dietPlan);
                Protein protein = proteinFactory.create(dietPlan);
                Meal meal = new Meal(carb, protein, fat);
                meal.displayMeal();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
