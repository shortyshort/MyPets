public class MyPetDriver
{
    public static void main (String[] arg)
    {
        Dog rex = new Dog("Rex", "German Shepherd", 2, 160.2);
        Lizard mochi = new Lizard("Mochi", "Blue-Tongued Stink", 8, 2);
        Bird donald = new Bird("Donald", "Duck", 85, 1.13, "White", 500 );
        //Pet secret = new Pet("Secret", 7, 40.2);  pet is an absract class and cannot be instantiated
        //abstract classes cannot be printed,even with necessary elements

        Dog pablo = new Dog("Chihuahua", "Pablo", true, 5, 25.0, "kibble");
        Bird tony = new Bird("Parrot", "Tony", false, 2, 10.0, "seeds");

        System.out.println(rex.Speak()); //only works when rex is a dog, not when rex is a pet
        System.out.println (rex.fetch()); //dependent on what type of pet rex is

//        int[]arrayoOInts = new int[5];
//        Pet[] menagerie = new Pet[5];
//        menagerie[0] = rex;
//        menagerie[1] = shaggy;
//        menagerie[2] = chimkin;

        //Speaking to pets
        System.out.println ("Rex says: " + rex.Speak());
        System.out.println ("Mochi says: " + mochi.Speak());
        System.out.println ("Donald says: " + donald.Speak());

        //Check unit conversion
        System.out.println ("Rex's weight in pounds is " + rex.AmericanFreedomUnits() + ".\n");

        //Testing Pets
        System.out.println(donald);
        System.out.println(mochi);
        System.out.println (rex);
        System.out.println(tony);
        System.out.println(pablo);
        System.out.println();

    }
}
