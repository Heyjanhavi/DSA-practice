/*
Problem: Find the Second Largest Element in an Array
Difficulty: Easy

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class Secndprgrm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sixe of array: ");
        int n = sc.nextInt();

        if (n < 2){
            System.out.println("No Second largest element");
            return;
        }

        int[] numbers = new int[n];
        System.out.print("enter the array: ");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int second_largest = Integer.MIN_VALUE;
        boolean foundSecondLargest = false;
        
        for (int i=1; i<n; i++){
            if (numbers[i] > largest){
                second_largest = largest;
                largest = numbers[i];
                foundSecondLargest = true;
            }else if (numbers[i] < largest && numbers[i] > second_largest){
                second_largest = numbers[i];
                foundSecondLargest = true;
            }
        }
        if(!foundSecondLargest){
            System.out.println("No second largest element present");
        }else {
            System.out.println(second_largest);
        }
    }
}
