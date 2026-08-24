/*Given an array of positive integers and k, find the minimum length of a contiguous subarray whose sum is at least k.

Example:

nums = [2, 3, 1, 2, 4, 3]
k = 7

Possible answer:

[4,3]

Sum = 7

Length = 2

So answer = 2. */

import java.util.*;

public class SlidingWindow3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array:");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the minimum sum:");
        int k = sc.nextInt();

        int left = 0;
        int sum = 0;
        int minLength = n + 1;

        for (int right=0; right<n; right++) {
            sum += nums[right];

            while (sum >= k) {
                int length = right - left + 1;
                if (length < minLength) {
                    minLength = length;
                }
                sum -= nums[left];
                left++;
            }
        }
        if (minLength == n+1){
            System.out.println(0);
        }else {
            System.out.println(minLength);
        }
    }
}
