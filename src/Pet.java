import java.text.DecimalFormat; // to format the weight in pounds
public abstract class Pet
{
    //Instance Variables
    protected String name;
    protected int age;
    protected double weight; //in kg
    public String food;
    public boolean hasOwner;
    DecimalFormat fmt = new DecimalFormat("#.#"); //create formatting object

    //constructors
    public Pet(String name,boolean hasOwner, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.hasOwner = hasOwner;
        this.weight = weight;
        this.food = food;
    }//end full constructor called child classes

    //Getters
    public String getName()
    {
        return name;
    }//end name getter
    public int getAge()
    {
        return age;
    }//end age getter

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }//end name setter

    //Brain Methods
    abstract public String Speak(); //to be overridden in all child classes
    abstract public int monthlyFeeding(); //to be overridden in child classes.

public double AmericanFreedomUnits()
{
    return weight * 2.205;
}//end method to convert weight value into pounds

    public String toString()
    {
        String output = "Name " + name + "\nHasOwner: " + hasOwner;
        output += "\nAge " + age;
        output += "\nWeight " + weight + "kg " + "(" +
                fmt.format(AmericanFreedomUnits()) + "in pounds)";
        output += "\nFood: " + food;
        return output;
    }
}
