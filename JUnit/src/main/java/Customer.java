public class Customer {
    private final String name;
    private final String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    @Override
    public String toString() {
        return "Customer Name: " + name + "\nDiet Plan: " + dietPlan + "\n";
    }

    public void displayInfo() {
        System.out.print(this);
    }
}
