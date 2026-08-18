/* You're given an array containing positive and negative numbers.

Rearrange it so that:

positive and negative numbers alternate
positive numbers come first
their relative order should be maintained

Example:

nums = [3, 1, -2, -5, 2, -4]

Output:
[3, -2, 1, -5, 2, -4] */

import java.util.*;

public class RearrageBySign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("enter the array: ");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int positive = 0;
        int negative = 1;

        for (int i=0; i<n; i++){
            if (nums[i] > 0){
                result[positive] = nums[i];
                positive += 2;
            }else if (nums[i] < 0){
                result[negative] = nums[i];
                negative += 2;
            }
        }
        for (int k=0; k<n; k++){
            System.out.println(result[k]);
        }
    }
}
