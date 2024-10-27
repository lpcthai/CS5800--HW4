
public class Main {
    public static void main(String[] args) {
        // Pizza Hut

        Pizza HutSmallPizza = new PizzaBuilder(Pizza.Chain.PIZZA_HUT)
                .size(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .build();

        Pizza HutMediumPizza = new PizzaBuilder(Pizza.Chain.PIZZA_HUT)
                .size(Pizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.PEPPERS)
                .addTopping(Pizza.Topping.CHICKEN)
                .addTopping(Pizza.Topping.CHICKEN)
                .addTopping(Pizza.Topping.ONIONS)
                .addTopping(Pizza.Topping.BACON)
                .addTopping(Pizza.Topping.SPINACH)
                .build();

        Pizza HutLargePizza = new PizzaBuilder(Pizza.Chain.PIZZA_HUT)
                .size(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.PINEAPPLE)
                .addTopping(Pizza.Topping.TOMATO_BASIL)
                .addTopping(Pizza.Topping.PEPPERS)
                .addTopping(Pizza.Topping.SPICY_PORK)
                .addTopping(Pizza.Topping.BEEF)
                .addTopping(Pizza.Topping.PESTO)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .addTopping(Pizza.Topping.OLIVES)
                .build();

        HutLargePizza.eat();
        System.out.println();

        HutMediumPizza.eat();
        System.out.println();

        HutSmallPizza.eat();
        System.out.println();

        Pizza PizzaHutLarge = new PizzaBuilder(Pizza.Chain.PIZZA_HUT)
                .size(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.CHICKEN)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .build();


        Pizza PizzaHutSmall = new PizzaBuilder(Pizza.Chain.PIZZA_HUT)
                .size(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .build();

//Small pizza with 6 toppings
        Pizza LCsmallpizza = new PizzaBuilder(Pizza.Chain.LITTLE_CAESARS)
                .size(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.BEEF)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.PINEAPPLE)
                .addTopping(Pizza.Topping.MUSHROOMS)
                .addTopping(Pizza.Topping.OLIVES)
                .build();

        //Medium pizza with 8 topping
        Pizza LCMediumPizza = new PizzaBuilder(Pizza.Chain.LITTLE_CAESARS)
                .size(Pizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.ONIONS)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.PEPPERS)
                .addTopping(Pizza.Topping.SPICY_PORK)
                .addTopping(Pizza.Topping.OLIVES)
                .addTopping(Pizza.Topping.PEPPERONI)
                .addTopping(Pizza.Topping.TOMATO_BASIL)
                .addTopping(Pizza.Topping.EXTRA_CHEESE)
                .build();

//Small pizza with 1 topping
        Pizza PizzaSDominos = new PizzaBuilder(Pizza.Chain.DOMINOS)
                .size(Pizza.Size.SMALL)
                .addTopping(Pizza.Topping.PEPPERONI)
                .build();

//Large pizza with 3 toppings
        Pizza PizzaLDominos = new PizzaBuilder(Pizza.Chain.DOMINOS)
                .size(Pizza.Size.LARGE)
                .addTopping(Pizza.Topping.CHICKEN)
                .addTopping(Pizza.Topping.PESTO)
                .addTopping(Pizza.Topping.SAUSAGE)
                .build();

        PizzaHutLarge.eat();
        System.out.println();

        PizzaHutSmall.eat();
        System.out.println();


        LCMediumPizza.eat();
        System.out.println();


        LCsmallpizza.eat();
        System.out.println();


        PizzaSDominos.eat();
        System.out.println();


        PizzaLDominos.eat();
        System.out.println();
    }
}



