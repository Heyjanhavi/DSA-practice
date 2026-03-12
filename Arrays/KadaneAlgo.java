/* problem: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.*/


import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter the array");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            current_sum = current_sum + nums[i];
            if (current_sum > max_sum){
                max_sum = current_sum;
            }
            if (current_sum < 0){
                current_sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
