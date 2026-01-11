/* Problem: Count maximum numbers of consecutive 1s in an array
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
        int current_count = 0;
        int max_count = 0;
        for (int i=0; i<n; i++){
            if (arr[i] == 1){
                current_count++;
                max_count = Math.max(current_count , max_count);
            }else{
                current_count = 0;
        }
        System.out.println("the number of 1s in the array are: " + max_count);
    }
}
