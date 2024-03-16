public class Carbs implements Macronutrient
{
    private final String name;

    public Carbs(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
