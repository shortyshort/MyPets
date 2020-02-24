public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight)
    {
        super(name, age, weight);
        this.species = species;
    }//end full constructor with call to super

    public String Speak()
    {
        return "Hiss";
    }

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }//end if puppy
        else
        {
            dailyFeedings = 1;
        }//end else adult
        return dailyFeedings * 30;
    }//end method explaining how many feedings per month, for budgetary reasons

    public String toString()
    {
        String output = super.toString() + "\nSpecies " + species;
        return output;
    }//end toString
}//end class Pet
