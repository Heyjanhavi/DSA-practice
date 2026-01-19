/* Problem:  Given an array of integers, rotating array of elements by d elements either left or right.*/

import java.util.Scanner;

public class dsa5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter the array: ");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("By how many places to rotate the array: ");
        int d = sc.nextInt();

        int[] temp = new int[d];
        for (int i=0; i<d; i++){
            temp[i] = numbers[i];
        }
        for (int i=0; i<n-d; i++){
            numbers[i] = numbers[i+d];
        }
        for (int i=0; i<d; i++){
            numbers[n-d+i] = temp[i];
        }
        for (int i=0; i<n; i++){
            System.out.print(numbers + " ");
        }
    }
}
