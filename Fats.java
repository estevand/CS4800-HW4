public class Fats implements Macronutrient
{
    private final String name;

    public Fats(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}
