package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 7/5/2017.
 */
public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arrayElementValueFromConsole = sc.nextLine();

        //int[] myArray = new int[]{};
        int[] cats = {arrayElementValueFromConsole};


        //2. на вход через консоль принимает массив чисел
//        for (int i = 0; ; i++) {
//            try{
//                System.out.println("Enter array element - " + i);
//                int arrayElementValueFromConsole = sc.nextInt();
//                //sc.nextInt();
//                myArray[i] = arrayElementValueFromConsole;
//            } catch (Exception e) {
//                System.out.println("Ouasdsadsa as as as ");
//                break;
//            }
//
//        }

        System.out.println("Our array now looks like: " + Arrays.toString(cats));
    }
}
/*
*
* 9. Избавиться от пункта номер один. Массив в программе должен быть создан такого же размера
* как длинна массива из консоли (пример: 10, 10, 10, 10
* тут размер массива 4; 10, 10 тут размер массива 2)
*
* */