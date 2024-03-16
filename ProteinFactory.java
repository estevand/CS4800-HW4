import java.util.Random;

public class ProteinFactory implements MacronutrientFactory
{
    private final String[] options = {"Fish", "Chicken", "Beef", "Tofu"};
    private final Random random = new Random();

    @Override
    public Macronutrient create()
    {
        return new Protein(options[random.nextInt(options.length)]);
    }
}
