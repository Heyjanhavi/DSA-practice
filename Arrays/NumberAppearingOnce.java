/* Problem: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
   Time complexity:O(n)
   Space complexity:O(1) */


import java.util.Scanner;

public class noappearsonce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter the array:");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int result = 0;
        for (int i=0; i<n; i++){
            result ^= numbers[i];
        }
        System.out.println("the number occuring only once is " + result);
    }
}
