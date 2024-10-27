import java.util.List;

class Pizza {
    private final Chain chain;
    private final Size size;
    private final List<Topping> toppings;

    enum Size {
        SMALL, MEDIUM, LARGE
    }

     enum Chain {
        DOMINOS, PIZZA_HUT, LITTLE_CAESARS
    }


    enum Topping {
        PEPPERONI, MUSHROOMS, EXTRA_CHEESE, SAUSAGE, OLIVES,
        CHICKEN, ONIONS, BACON, SPINACH, HAM, PINEAPPLE,
        TOMATO_BASIL, PEPPERS, SPICY_PORK, BEEF, PESTO
    }

    public Pizza(Chain chain, Size size, List<Topping> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public Chain getChain() {
        return chain;
    }

    public Size getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void eat() {
        System.out.println("Pizza's chain: " + chain);
        System.out.println("Pizza's size: " + size);
        System.out.print("Toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.print(toppings.get(i));
            if (i < toppings.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
