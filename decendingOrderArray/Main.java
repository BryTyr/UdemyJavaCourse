package decendingOrderArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

         int[] myIntArray = getIntegers(5);
         printArray(myIntArray);
        int[] mySortedIntArray = DecendingOrderSort(myIntArray);
        printArray(mySortedIntArray);

    }

    private static int[] DecendingOrderSort(int[] myIntArray) {
       // could have used the Integer class and used Array.sort with collections but wanted a more manual solution for
        // practice so i sorted the primitive its into ascending  order and inverted the result
        Arrays.sort(myIntArray);

        int LowerIndexValue=0;
        int UpperIndexValue=myIntArray.length-1;
        // this for loop executes to the half way point swapping the index around hence reversing order
        for(int i=0;i<myIntArray.length/2;i++){
            System.out.println("number is "+UpperIndexValue);
            int temp = myIntArray[UpperIndexValue];
            myIntArray[UpperIndexValue]=myIntArray[LowerIndexValue];
            myIntArray[LowerIndexValue]=temp;
            LowerIndexValue++;
            UpperIndexValue--;
        }
        return myIntArray;
    }

    private static void printArray(int[] inputArray) {
        for(int i=0;i<inputArray.length;i++){
            System.out.println("At index "+i+" the value stored is "+inputArray[i]);
        }
    }

    public static int[] getIntegers(int size) {
        int[] TempIntArray = new int[size];

        for(int i=0;i<TempIntArray.length;i++){
            System.out.println("please enter a integer number \n");
            TempIntArray[i]=scanner.nextInt();
        }
        return TempIntArray;
    }
}
