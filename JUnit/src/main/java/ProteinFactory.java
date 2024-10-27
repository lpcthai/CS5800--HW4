import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein create(String dietPlan) {
        List<Protein.Type> proteins = getAvailableProteins(dietPlan);
        if (proteins.isEmpty()) {
            throw new IllegalArgumentException("No Proteins: " + dietPlan);
        }
        return new Protein(proteins.get(new Random().nextInt(proteins.size())));
    }

    private List<Protein.Type> getAvailableProteins(String dietPlan) {
        switch (dietPlan) {
            case "Vegan":
                return List.of(Protein.Type.TOFU);
            case "Nut Allergy":
                return Arrays.asList(Protein.Type.FISH, Protein.Type.CHICKEN, Protein.Type.BEEF);
            case "No Restriction":
                return Arrays.asList(Protein.Type.values());
            default:
                throw new IllegalArgumentException("No Proteins: " + dietPlan);
        }
    }
}
