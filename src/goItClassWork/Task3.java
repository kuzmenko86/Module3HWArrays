package goItClassWork;

import java.util.Arrays;

/**
 * Created by Admin on 7/6/2017.
 */
public class Task3 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,3};
        int[] array2 = {1,2,3,6,4,33,3,22,0,2,2};

        int[] arrayMax = array1.length > array2.length ? array1 : array2;
        int[] arrayMin = array1.length < array2.length ? array1 : array2;

        for (int i = 0; i<arrayMin.length; i++){
            arrayMax[i] = arrayMax[i] + arrayMin[i];
        }
        System.out.println("The sum of values from two arrays are: " + Arrays.toString(arrayMax));
    }
}



