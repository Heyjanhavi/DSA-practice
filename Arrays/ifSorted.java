/* Problem: Check if an array is sorted
  Time Complexity: O(n)
  Space Complexity: O(1) */




import java.util.Scanner;

public class Dsa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the array: ");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        boolean is_sorted = true;

        for (int i=1; i<n; i++){
            if (numbers[i] < numbers[i-1]){
                is_sorted = false;
                break;
            }
        }
        if (is_sorted){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }

    }
}
