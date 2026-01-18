/* Problem: Given an array of integers arr[] and an integer target.
1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Time complexity:O(n)
Space complexity:O(n) */


import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        System.out.print("Enter the array: ");
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the sum to be found:");
        int sum = sc.nextInt();

        HashMap <Integer,Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            int first = numbers[i];
            int second = sum - first;
            if (map.containsKey(second)){
                System.out.println(map.get(second) + " " + i);
                return;
            }
            map.put(first, i);
        }
        System.out.println("-1,-1");
    }
}
