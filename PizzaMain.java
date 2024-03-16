public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizzaHut1 = new Pizza.PizzaBuilder("Pizza Hut", "Small").addPepperoni().addSausage().addBacon().build();
        Pizza pizzaHut2 = new Pizza.PizzaBuilder("Pizza Hut", "Medium").addPepperoni().addBeef().addChicken().addOlives().addPeppers().addExtraCheese().build();
        Pizza pizzaHut3 = new Pizza.PizzaBuilder("Pizza Hut", "Large").addPepperoni().addSausage().addMushrooms().addOnions().addSpinach().addSpicyPork().addTomatoAndBasil().addPesto().addBeef().build();

        
        pizzaHut1.eat();
        pizzaHut2.eat();
        pizzaHut3.eat();


        Pizza pizzaHut4 = new Pizza.PizzaBuilder("Pizza Hut", "Large").addPepperoni().addExtraCheese().addPeppers().build();
        Pizza pizzaHut5 = new Pizza.PizzaBuilder("Pizza Hut", "Small").addPepperoni().addSpicyPork().build();

        Pizza littleCaesars1 = new Pizza.PizzaBuilder("Little Caesars", "Medium").addHamAndPineapple().addSpicyPork().addPesto().addBeef().addTomatoAndBasil().addSpinach().addOlives().addChicken().build();
        Pizza littleCaesars2 = new Pizza.PizzaBuilder("Little Caesars", "Small").addExtraCheese().addBacon().addPepperoni().addBeef().addChicken().addHam().build();

        Pizza dominos1 = new Pizza.PizzaBuilder("Dominos", "Small").addPepperoni().build();
        Pizza dominos2 = new Pizza.PizzaBuilder("Dominos", "Large").addPepperoni().addBacon().addSausage().build();


        pizzaHut4.eat();
        pizzaHut5.eat();

        littleCaesars1.eat();
        littleCaesars2.eat();

        dominos1.eat();
        dominos2.eat();
    }
    
}
