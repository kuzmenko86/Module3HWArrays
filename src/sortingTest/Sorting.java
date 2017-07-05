package sortingTest;

import java.util.Arrays;

/**
 * Created by Admin on 7/4/2017.
 */
public class Sorting {
    public static void main(String[] args) {
        int[] testArray = new int[]{10,9,4,8,11};
        //int[] testArray = new int[]{3,4,10,9,8};

        for (int i=0; i < testArray.length; i++){
            for (int j=1+i; j < testArray.length; j++){
                if (testArray[i] > testArray[j]){
                    int temp = testArray[i];
                    testArray[i] = testArray[j];
                    testArray[j] = temp;

                }

            }
        }
        //System.out.println(testArray);
        for (int k=0; k < testArray.length; k++){
            System.out.println(testArray[k]);
        }
        System.out.println(Arrays.toString(testArray));
    }
}
