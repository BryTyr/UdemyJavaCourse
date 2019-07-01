package interfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Create a simple interface that allows an object to be saved to some sort of storage medium.
    // The exact type of medium is not known to the interface (nor to the classes that implement it).
    // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
    // and the other to populate the object's fields from an ArrayList.
    //
    // Create some sample classes that implement your saveable interface (we've used the idea of a game,
    // with Players and Monsters, but you can create any type of classes that you want).
    //
    // Override the toString() method for each of your classes so that they can be easily printed to enable
    // the program to be tested easier.
    //
    // In Main, write a method that takes an object that implements the interface as a parameter and
    // "saves" the values.
    public static void main(String[] args) {

        List<String> data = new ArrayList<>();
        data.add("Tim");
        data.add("62");

        Player player = new Player();
        saveValue(player,data);
        readValue(player);


    }
    public static void saveValue(ISaveable object,List<String> data){
            object.readData(data);
            for(String string : data) {
                System.out.println("Saving data: " + string);
            }
        }

    public static void readValue(ISaveable object){
        for(int i=0;i<object.writeData().size();i++){
            System.out.println("Loading data: "+object.writeData().get(i));
        }
    }
}
