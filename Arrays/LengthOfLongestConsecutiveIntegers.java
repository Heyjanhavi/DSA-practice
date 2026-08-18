/*Given an unsorted array, find the length of the longest sequence of consecutive integers.

Example:

nums = [100, 4, 200, 1, 3, 2]

The consecutive sequence is:

1, 2, 3, 4

So the answer is:

4 */

import java.util.*;
public class LongestConsecutiveSequesnce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the array:");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++){
            set.add(nums[i]);
        }

        int maxLength = 0;

        for (int i=0; i<n; i++){
            int num = nums[i];

            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        System.out.println(maxLength);
    }
}
