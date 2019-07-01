package lambdaChallenge1;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    //Challenge 1: for the below code change the code to use a lambda

//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part: parts) {
//                    System.out.println(part);
//                }
//            }
//        };

    // second challenge: Write the below code as a lambda expression

//    public static String everySecondCharacter(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(s.charAt(i));
//            }
//        }
//    }


    // Challenge 3: The above lambda function does not execute write code to utilize it

    // Challenge 4: Instead of executing tge function directly pass it to a method instead.
    // write a method to accept the function as a parameter and execute it
    // bonus points for not hard coding the argument string within the method

    // Challenge 5: write an lambda expression that maps to the supplier interface. this lambda should
    // return the string i love java!. Assign it to a variable ILoveJava;

    public static void main(String[] args) {
        // Challenge 1
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        runnable.run();

        // Challenge 2
        Function<String, String> everySecondCharacter = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // Challenge 3
        System.out.println(everySecondCharacter.apply("123456789"));

        System.out.println(everySecondCharacterCall(everySecondCharacter,"HelloWorld!"));

        // Challenge 5
        Supplier<String> ILoveJava = () -> "I Love Java!";

        System.out.println(ILoveJava.get());
    }

    // Challenge 4
    public static String everySecondCharacterCall(Function<String, String> everySecondCharacter, String value){
        return everySecondCharacter.apply(value);
    }
}


