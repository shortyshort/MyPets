public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan; //in inches

    public Bird (String name,String species, boolean hasOwner, int age, double weight,
                 String color, double wingspan, String food)
    {
        super(name, hasOwner,age, weight, food);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    }//end full constructor with super

    public int monthlyFeeding()
    {
        return 8;
    }//end method to determine the number of feedings

    public String Speak()
    {
        if(this.species.equals("Duck"))
        {
            return "Quack";
        }
        return "The universe is a simulation";
    }

    public String toString()
    {
        String output = super.toString() + "\nColor " + color;
        output += "\nWingspan " + "inches" + wingspan;
        output += "\nSpecies " + species;
        return output;
    }

}
