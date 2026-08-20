/*You're given:

an array of integers
an integer k
find the maximum sum of any contiguous subarray containing exactly k elements */

import java.util.*;

public class maxSumSubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("enter the array:");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        int windowSum = 0;
        int maxSum = 0;

        for (int i=0; i<k; i++){
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i=k; i<n; i++){
            windowSum = windowSum - nums[i-k] + nums[i];

            if (windowSum > maxSum){
                maxSum = windowSum;
            }
        }

        System.out.println(maxSum);
    }
}
