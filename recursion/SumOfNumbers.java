/* Problem: sum of first n natural numbers*/

import java.util.Scanner;

public class SumOfNNaturalNosRecursion {

    public static int sum(int n){

        if (n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of naturnal numbers");
        int n = sc.nextInt();

        if (n <= 0 ){
            System.out.println("Enter a positive number ");
        }else {
            int result = sum(n);
            System.out.println(result);
        }
    }
}
