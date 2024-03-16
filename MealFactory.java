public class MealFactory
{
    private static MealFactory instance;
    private final MacronutrientFactory carbsFactory;
    private final MacronutrientFactory proteinFactory;
    private final MacronutrientFactory fatsFactory;

    private MealFactory()
    {
        carbsFactory = new CarbsFactory();
        proteinFactory = new ProteinFactory();
        fatsFactory = new FatsFactory();
    }

    public static MealFactory getInstance()
    {
        if (instance == null) {
            instance = new MealFactory();
        }
        return instance;
    }

    public Macronutrient createCarbs() 
    {
        return carbsFactory.create();
    }

    public Macronutrient createProtein()
    {
        return proteinFactory.create();
    }

    public Macronutrient createFats()
    {
        return fatsFactory.create();
    }
}
