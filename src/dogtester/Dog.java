package dogtester;

/**
 * Created by Ethan Watt
 * On October 11, 2016
 * Class of dogTester that creates the dog object
 */
public class Dog {
  //variables for characteristics

  private String dogName, dogBreed;
  private int aggression, hunger;

  //constructors
  
  /**
   * pre: none
   * post: none
   * Method to assign base values to variables
   */
  public Dog() {
    dogName = "Unknown Dog";
    dogBreed = "Unknown Breed";
    aggression = 0;
    hunger = 0;
  }

  /**
   * pre: dog name, dog breed, aggression, and hunger
   * post: none
   * Method of constructor to look for 4 variable values in dogTester
   */
  public Dog(String dgName, String dgBreed, int agg, int hung) {
    dogName = dgName;
    dogBreed = dgBreed;
    aggression = agg;
    hunger = hung;
  }

  
  /**
   * pre: dog name and dog breed
   * post: none
   * Method of an alternate constructor to look for 2 variable values in dogTester
   */
  public Dog(String dgName, String dgBreed) {
    //This constructor only uses the name and breed
    //Set the aggression and hunger to random #s

    dogName = dgName;
    dogBreed = dgBreed;
    aggression = (int) (Math.random() * 10) + 1;
    hunger = (int) (Math.random() * 10) + 1;
  }
  
  /**
   * pre: none
   * post: none
   * Method to set string for friendly dog barks
   */
  public void barkFriendly() {
    System.out.println("Arf! Arf!");
  }

  /**
   * pre: none
   * post: none
   * Method to set string for angry dog barks
   */
  public void barkAngry() {
    System.out.println("GRR! RRRFFF!");
  }

  /**
   * pre: none
   * post: output to dogTester
   * Method to display all characteristics of the dog
   */
  public String toString() {
    String output = "Name: " + dogName + "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    //output string is complete, return it
    return output;
  }
}
