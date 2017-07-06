package goItClassWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 7/6/2017.
 */
public class Task2RefflectionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the array size");
        int arraySize = sc.nextInt();

        int[] myArray = new int[arraySize];

        for (int i = 0, j = 1; i < myArray.length; i++, j++){
            System.out.println("Enter array element - " + i );
            int arrayElementValueFromConsole = sc.nextInt();
            myArray[i] = arrayElementValueFromConsole;
            System.out.println("Please note you still need to enter " + (myArray.length - j ) + " - array element(s).");
        }

        System.out.println("Our array now looks like: " + Arrays.toString(myArray));

        for (int i = 0, j = arraySize - 1; i < (myArray.length/2); i++, j--){
            int temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
        }

        System.out.println("After resorting our array now looks like: " + Arrays.toString(myArray));

        int[] myNewArray = new int[arraySize];
        for (int i = 0, j = arraySize - 1; i < myArray.length; i++, j--){
            myNewArray[i] = myArray[j];

        }
        System.out.println("Solution After resorting our array now looks like: " + Arrays.toString(myNewArray));

    }
}
