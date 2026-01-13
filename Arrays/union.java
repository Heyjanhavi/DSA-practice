/* Problem: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.Elements in the union should be inascending order
   Time complexity: O(n+m)
   Space Complexity: O(n+m) */


import java.util.ArrayList;
import java.util.Scanner;

public class union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();
        int[] num1 = new int[n];
        System.out.print("Enter first array: ");
        for (int i=0; i<n; i++){
            num1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] num2 = new int[m];
        System.out.print("Enter second array: ");
        for (int i=0; i<m; i++){
            num2[i] = sc.nextInt();
        }
        ArrayList <Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i<n && j<m){
            if (num1[i] < num2[j]){
                union.add(num1[i]);
                i++;
            } else if (num1[i] > num2[j]) {
                union.add(num2[j]);
                j++;
            }
            else {
                union.add(num1[i]);
                i++;
                j++;
            }
        }
        while (i<n){
            union.add(num1[i]);
            i++;
        }
        while (j<m){
            union.add(num2[j]);
            j++;
        }

        System.out.println(union);
        

    }
}
