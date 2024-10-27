public class Meal {
    private final Carb carb;
    private final Protein protein;
    private final Fat fat;

    public Meal(Carb carb, Protein protein, Fat fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public void displayMeal() {
        System.out.println(carb);
        System.out.println(protein);
        System.out.println(fat);
    }

    @Override
    public String toString() {

        return  carb + ", " + protein + ", " + fat;
    }
}
