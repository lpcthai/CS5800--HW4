import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarbFactory {
    private static CarbFactory instance;

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public Carb create(String dietPlan) {
        List<Carb.Type> carbs = getAvailableCarbs(dietPlan);
        if (carbs.isEmpty()) {
            throw new IllegalArgumentException("No available carbs for diet plan: " + dietPlan);
        }
        return new Carb(carbs.get(new Random().nextInt(carbs.size())));
    }

    private List<Carb.Type> getAvailableCarbs(String dietPlan) {
        switch (dietPlan) {
            case "Paleo":
                return List.of(Carb.Type.PISTACHIO);
            case "Vegan":
                return List.of(Carb.Type.LENTILS);
            case "Nut Allergy":
                return Arrays.asList(Carb.Type.BREAD, Carb.Type.LENTILS);
            default:
                return Arrays.asList(Carb.Type.values());
        }
    }
}
