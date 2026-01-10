/* Problem: Count maximum numbers of 1s in an array
   Time complexity: O(n)
   Space complexity: O(1) */



import java.util.Scanner;

public class maxones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0; i<n; i++){
            if (arr[i] == 1){
                count++;
            }
        }
        System.out.println("the number of 1s in the array are: " + count);
    }
}
