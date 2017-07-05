package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 7/5/2017.
 */
public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. на вход через консоль принимает размер массива
        System.out.println("Please enter the array size");
        int arraySize = sc.nextInt();

        //2. на вход через консоль принимает массив чисел
        int[] myArray = new int[arraySize];

        for (int i = 0, j = 1; i < myArray.length; i++, j++){
            System.out.println("Enter array element - " + i );
            int arrayElementValueFromConsole = sc.nextInt();
            //sc.nextInt();
            myArray[i] = arrayElementValueFromConsole;
            System.out.println("Please note you still need to enter " + (myArray.length - j ) + " - array element(s).");


        }
        System.out.println("Our array now looks like: " + Arrays.toString(myArray));

        // 3. найти минимальное число в массиве и вывести в консоль (без использования сортировки)
        int min = myArray[0];
        for (int i=0; i < myArray.length; i++){
            if (min > myArray[i]){
                min = myArray[i];
            }
        }
        System.out.println("The smallest number in array is - " + min);

        // 4. найти максимальное число в массиве и вывести в консоль (без использования сортировки)
        int max = myArray[0];
        for (int i=0; i < myArray.length; i++){
            if (max < myArray[i]){
                max = myArray[i];
            }
        }
        System.out.println("The largest number in array is - " + max);

        //5. посчитать кол-во повторений числа 5 и вывести в консоль
        int repetitiveIntInArray = 5;
        int repetitiveIntInArrayQTY = 0;

        for (int i=0; i < myArray.length; i++){
            if (myArray[i] == repetitiveIntInArray){
                repetitiveIntInArrayQTY++;
            }
        }
        System.out.println("The number " + repetitiveIntInArray + " is repeated " + repetitiveIntInArrayQTY + " times in our array");

        //6. вывести в консоль отсортированный массив
        for (int i=0; i < myArray.length; i++){
            for (int j=1+i; j < myArray.length; j++){
                if (myArray[i] > myArray[j]){
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        System.out.println("Here is sorted array " + Arrays.toString(myArray));

    }
}
