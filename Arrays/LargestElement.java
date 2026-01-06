/* Problem : Find the largest element in an array
   Difficulty: easy
   Time complexity: O(n)
   Space complexity: O(1) */


import java.util.Scanner;

public class largst_no_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
         int n = sc.nextInt();

         int[] numbers = new int[n];
        System.out.println("Enter the array");

        for (int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }

        int largest = numbers[0];
        for (int i=0; i<n; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("the largest number in the arry is " + largest);
    }

}
