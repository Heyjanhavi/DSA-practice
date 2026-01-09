/* Problem: Remove duplicates from an array

   Time Complexity: O(n)
   Space complexity: O(n)*/
  

import java.util.HashSet;
import java.util.Scanner;

public class rmvduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the array");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : numbers){
            set.add(x);
        }
        System.out.println(set);
    }
}
