import java.util.Random;

public class CarbsFactory implements MacronutrientFactory
{
    private final String[] options = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private final Random random = new Random();

    @Override
    public Macronutrient create()
    {
        return new Carbs(options[random.nextInt(options.length)]);
    }
}
