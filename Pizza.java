import java.util.ArrayList;
import java.util.List;

public class Pizza
{
    private String chain;
    private String size;
    private List<String> toppings;

    public Pizza(String chain, String size)
    {
        this.chain = chain;
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public void eat()
    {
        System.out.println("Pizza Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.print("\n");
    }

    static class PizzaBuilder
    {
        private String chain;
        private String size;
        private List<String> toppings;

        public PizzaBuilder(String chain, String size)
        {
            this.chain = chain;
            this.size = size;
            this.toppings = new ArrayList<>();
        }

        public PizzaBuilder addPepperoni()
        {
            toppings.add("Pepperoni");
            return this;
        }

        public PizzaBuilder addSausage()
        {
            toppings.add("Sausage");
            return this;
        }

        public PizzaBuilder addMushrooms()
        {
            toppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder addBacon()
        {
            toppings.add("Bacon");
            return this;
        }

        public PizzaBuilder addOnions()
        {
            toppings.add("Onions");
            return this;
        }

        public PizzaBuilder addExtraCheese()
        {
            toppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder addPeppers()
        {
            toppings.add("Peppers");
            return this;
        }

        public PizzaBuilder addChicken()
        {
            toppings.add("Chicken");
            return this;
        }

        public PizzaBuilder addOlives()
        {
            toppings.add("Olives");
            return this;
        }

        public PizzaBuilder addSpinach()
        {
            toppings.add("Spinach");
            return this;
        }

        public PizzaBuilder addTomatoAndBasil()
        {
            toppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder addBeef()
        {
            toppings.add("Beef");
            return this;
        }

        public PizzaBuilder addHam()
        {
            toppings.add("Ham");
            return this;
        }

        public PizzaBuilder addPesto()
        {
            toppings.add("Pesto");
            return this;
        }

        public PizzaBuilder addSpicyPork()
        {
            toppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder addHamAndPineapple()
        {
            toppings.add("Ham and Pineapple");
            return this;
        }

        public Pizza build()
        {
            Pizza pizza = new Pizza(chain, size);
            pizza.toppings.addAll(toppings);
            return pizza;
        }
    }
}
