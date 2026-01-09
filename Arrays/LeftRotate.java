/*  Problem: Left rotate an array by 1 place
    Time complexity: O(n)
    Space complexity: O(1) */


import java.util.Arrays;
import java.util.Scanner;

public class dsa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the array: ");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int first = numbers[0];
        for (int i=1; i<n; i++){
            numbers[i-1] = numbers[i];
        }
        numbers[n-1] = first;
        System.out.println("the left rotated array is: ");
        for (int i=0; i<n; i++){
            System.out.println(numbers[i]);
        }

    }

}
  
