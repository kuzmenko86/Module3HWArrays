package goItClassWork;

import java.util.Scanner;

/**
 * Created by Admin on 7/6/2017.
 */
public class TestTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value for A");
        int A = sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter value for B");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;

        //int[] myArray = new int[]{};
        System.out.println("the variable A - " + A);
        System.out.println("the variable B - " + B);
    }
}
