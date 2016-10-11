/**
 * Created by Ethan Watt
 * On October 11, 2016
 * Use classes to simplify a program that describes a dog
 */
package dogtester;

/**
 * This is the class for the dog tester that contains the main method
 */
public class Dogtester {
    /**
     * pre: String array
     * post: void
     * Main method to print dog characteristics
     */
    
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rover", "Spaniel", 8, 4);
        Dog dog2 = new Dog("Spot", "Border Collie");
        Dog dog3 = new Dog();

        //Print the details of each dog
        System.out.println(dog1.toString());
        System.out.println("--------------------------");

        System.out.println(dog2.toString());
        System.out.println("--------------------------");

        //toString() is called by default, no need to write it!
        System.out.println(dog3);
        System.out.println("--------------------------");

        //dog1 barks friendly, dog2 barks angry
        dog1.barkFriendly();
        dog2.barkAngry();

    
    }
}