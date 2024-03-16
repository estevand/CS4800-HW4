import java.util.Random;

public class FatsFactory implements MacronutrientFactory
{
    private final String[] options = {"Avocado", "Sour cream", "Tuna", "Peanuts"};
    private final Random random = new Random();

    @Override
    public Macronutrient create()
    {
        return new Fats(options[random.nextInt(options.length)]);
    }
}
