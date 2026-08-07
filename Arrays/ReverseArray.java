/* problem: reverse an array */

import java.util.*;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array: ");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int i = 0;
        int j = n-1;

        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
        for (int k=0; k<n; k++){
            System.out.println(nums[k] + " ");
        }
    }
}
