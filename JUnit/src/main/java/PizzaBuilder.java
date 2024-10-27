import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private final Pizza.Chain chain;
    private Pizza.Size size;
    private final List<Pizza.Topping> toppings = new ArrayList<>();

    public PizzaBuilder(Pizza.Chain chain) {
        this.chain = chain;
    }

    public PizzaBuilder size(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(Pizza.Topping topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        return new Pizza(chain, size, toppings);
    }
}
