/* Problem: Given an integer array nums of size n, return the majority element of the array.
The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

  Time complexity:O(n)
  Space complexity:O(1) */


import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array: ");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int number = 0;
        int count = 0;
        for (int i=0; i<n; i++){
            if (count == 0){
                number = nums[i];
            }
            if (number == nums[i]){
                count++;
            }else {
                count--;
            }
        }
        for (int val: nums){
            if (val == number){
                count++;
            }
        }
        if (count > n/2){
            System.out.println(number);
        }else {
            System.out.println("-1");
        }


    }
}
