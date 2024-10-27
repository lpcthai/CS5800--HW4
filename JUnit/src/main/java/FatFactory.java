import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FatFactory {
    private static FatFactory instance;

    private FatFactory() {}

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat create(String dietPlan) {
        List<Fat.Type> fats = getAvailableFats(dietPlan);
        if (fats.isEmpty()) {
            throw new IllegalArgumentException("No fats found for diet plan: " + dietPlan);
        }
        return new Fat(fats.get(new Random().nextInt(fats.size())));
    }

    private List<Fat.Type> getAvailableFats(String dietPlan) {
        if (!isValidDietPlan(dietPlan)) {
            throw new IllegalArgumentException("Invalid diet plan: " + dietPlan);
        }

        List<Fat.Type> fats = new ArrayList<>(Arrays.asList(
                Fat.Type.AVOCADO, Fat.Type.SOUR_CREAM,
                Fat.Type.TUNA, Fat.Type.PEANUTS));

        if (dietPlan.equals("Paleo") || dietPlan.equals("Vegan")) {
            fats.remove(Fat.Type.SOUR_CREAM);
        }
        if (dietPlan.equals("Nut Allergy")) {
            fats.remove(Fat.Type.PEANUTS);
        }
        return fats;
    }

    private boolean isValidDietPlan(String dietPlan) {
        return Arrays.asList("No Restriction", "Paleo", "Vegan", "Nut Allergy").contains(dietPlan);
    }
}
