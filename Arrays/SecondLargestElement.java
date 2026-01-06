/*
Problem: Find the Second Largest Element in an Array
Difficulty: Easy

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;
import java.util.Scanner;

public class Secndprgrm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        if (n < 2){
            System.out.println("Second Largest element does not exist");
        }
        int[] numbers = new int[n];
        System.out.println("Enter the array: ");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int Largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if (numbers[i] > Largest ){
                second_largest = Largest;
                Largest = numbers[i];
            } else if (numbers[i] > second_largest && numbers[i] != Largest){
                second_largest = numbers[i];
            }
        }
        System.out.println("The second largest element in the array is " + second_largest);
    }
}
