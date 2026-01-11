/* Problem : given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
*/


import java.util.Scanner;

public class zeroestoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the array");
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int index = 0;
        for (int i=0; i<n; i++){
            if (numbers[i] !=0){
                numbers[index] = numbers[i];
                index++;
            }
        }
        while (index < n){
            numbers[index] = 0;
        }
        for (int num : numbers) {
            System.out.println(num + " ");
        }

    }
}
