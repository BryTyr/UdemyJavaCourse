package lambdaChallenge2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

    // Challenge 1: Write code to print the list topNames2015 in sorted order, and with the first letter of each
    //name upper cased. Use lambda expressions wherever possible

    // challenge 2: do the same but with stream operations

    // Challenge 3: print out how many names start with the letter A

    public static void main(String[] args) {

        //challenge 1:

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        Function<List<String>, List<String>> upperCase = (List<String> WordList) -> {
            for (String word : WordList) {
                String capitalWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                WordList.set(WordList.indexOf(word), capitalWord);
            }
            return WordList;
        };

        Comparator<String> titleComparator = (FirstWord, SecondWord) -> FirstWord.compareTo(SecondWord);

        // makes the first letter upper case
        List<String> UppercaseWordList = upperCase.apply(topNames2015);
        // sorts the list in natural ordering
        Collections.sort(UppercaseWordList, titleComparator);
        for (String word : UppercaseWordList) {
            System.out.println(word);
        }

        //Challenge 2:

        List<String> topNames2016 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        // solution to challenge 2 it is commented out to allow for challenge 3
//        topNames2016.stream()
//                .map(obj -> {
//                    String capitalWord = obj.substring(0, 1).toUpperCase() + obj.substring(1);
//                    return capitalWord;
//                })
//                .sorted()
//                .forEach(System.out::println);
//
//    }

        // challenge 3
        long countValue= topNames2016.stream()
                                    .map(obj -> {
                                        String capitalWord = obj.substring(0, 1).toUpperCase() + obj.substring(1);
                                        return capitalWord;
                                    })
                                    .filter(s -> s.startsWith("A"))
                                    .count();

        System.out.println("Th number of names starting with A is: "+countValue);

    }
}
