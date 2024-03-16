public class MacroMain {
    public static void main(String[] args)
    {
        Customer[] customers =
        {
            new Customer("John", "No Restriction"),
            new Customer("Amy", "Paleo"),
            new Customer("Jane", "Vegan"),
            new Customer("Chris", "Nut Allergy"),
            new Customer("Alex", "Paleo"),
            new Customer("Ted", "Vegan")
        };

        for (Customer customer : customers)
        {
            System.out.println("Customer: " + customer.getName() + " Diet: " + customer.getDietPlan());
            Macronutrient carbs = generateCarbs(customer.getDietPlan());
            Macronutrient protein = generateProtein(customer.getDietPlan());
            Macronutrient fats = generateFats(customer.getDietPlan());
            System.out.println("Carbs: " + carbs.getName());
            System.out.println("Protein: " + protein.getName());
            System.out.println("Fats: " + fats.getName());
            System.out.println();
        }
    }

    private static Macronutrient generateCarbs(String dietPlan)
    {
        MealFactory factory = MealFactory.getInstance();
        switch (dietPlan)
        {
            case "No Restriction":
            case "Paleo":
            case "Vegan":
            case "Nut Allergy":
                return factory.createCarbs();
            default:
                return null;
        }
    }

    private static Macronutrient generateProtein(String dietPlan)
    {
        MealFactory factory = MealFactory.getInstance();
        switch (dietPlan)
        {
            case "No Restriction":
            case "Paleo":
            case "Vegan":
            case "Nut Allergy":
                return factory.createProtein();
            default:
                return null;
        }
    }

    private static Macronutrient generateFats(String dietPlan)
    {
        MealFactory factory = MealFactory.getInstance();
        switch (dietPlan) {
            case "No Restriction":
            case "Paleo":
            case "Vegan":
            case "Nut Allergy":
                return factory.createFats();
            default:
                return null;
        }
    }
}
