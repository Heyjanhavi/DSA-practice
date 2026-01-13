/* Problwm: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. Find the number(between 1 to N), that is not present in the given array
   Time Complexity: O(N)
   Space Complexity:O(1) */



import java.util.Scanner;

public class missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int N = sc.nextInt();

        int[] numbers = new int[N-1];
        System.out.print("Enter the array: ");
        for (int i=0; i<N-1; i++){
            numbers[i] = sc.nextInt();
        }

        int expected_sum = N*(N+1)/2;
        int actual_sum = 0;
        for (int i=1; i<N-1; i++){
            actual_sum+= numbers[i];
        }
        int missing_number = expected_sum - actual_sum;
        System.out.println("missing number is " + missing_number);

    }
}
