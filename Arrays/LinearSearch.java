/* Problem: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.
   Time complexity : O(n)
  Space complexity: O(1) */


import java.util.ArrayList;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter the array");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int number_to_be_found = sc.nextInt();
        int index = -1;
        for (int i=0; i<n; i++){
            if (numbers[i] == number_to_be_found){
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.println(number_to_be_found + " is present at the position " + index);
        }else {
            System.out.println("-1");
        }

    }
}
