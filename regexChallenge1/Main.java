package regexChallenge1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    // challenge 1:
    // write a regex that matches the string "I want a bike!"

    //Challenge 2:
    // write a regex that will match I want a bike! OR i want a ball!

    //Challenge 3:
    // write a regex that will replace all blanks with underscores in the following phrase
    //"replace all blanks with underscores."

    //Challenge 4:
    // Match "aabbbbccdddddefffg" using regex

    //Challenge 5:
    // Write a regex that will match a series of letters followed by a dot followed by digits eg. abcd.234 or ab.12345

    public static void main(String[] args) {

        // Challenge 1:
        String challenge1 = "I want a bike!";

        String bikePattern = "I want a bike!";
        Pattern pattern = Pattern.compile(bikePattern);
        Matcher matcher = pattern.matcher(challenge1);

        while(matcher.find()){
        System.out.println("Challenge 1:"+matcher.group());
        }

        // Challenge 2:
        String challenge2 = "I want a ball!";

        String ballPattern = "I want a \\w{4}!";
        pattern = Pattern.compile(ballPattern);
        matcher = pattern.matcher(challenge1);

        while(matcher.find()){
            System.out.println("Challenge 2:"+matcher.group());
        }

        matcher = pattern.matcher(challenge2);

        while(matcher.find()){
            System.out.println("Challenge 2:"+matcher.group());
        }

        // Challenge 3:
        String challenge3 = "replace all blanks with underscores.";
        System.out.println("Challenge 3:"+challenge3.replaceAll("\\s","_"));

        // Challenge 4:
        String challenge4 = "aabbbbccdddddefffg";

        String letterPattern = "^a{2}b{4}c{2}d{5}ef{3}g$";
        pattern = Pattern.compile(letterPattern);
        matcher = pattern.matcher(challenge4);

        while(matcher.find()){
            System.out.println("Challenge 4:"+matcher.group());
        }

        // Challenge 5:
        String challenge5 = "qwe.132";
        String challenge5Fail = "123.qwe";
        String challenge5pass = "abeknjssl.284643649";

        String dotPattern = "^[a-z]+(\\.)[0-9]+$";
        pattern = Pattern.compile(dotPattern);
        matcher = pattern.matcher(challenge5);

        while(matcher.find()){
            System.out.println("Challenge 5 pass:"+matcher.group());
        }

        matcher = pattern.matcher(challenge5Fail);
        System.out.println("Challenge 5 fail:"+matcher.find());


        matcher = pattern.matcher(challenge5pass);
        while(matcher.find()){
            System.out.println("Challenge 5 pass:"+matcher.group());
        }

    }
}
