/* problem: find factorial of first n natural numbers*/

import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        return n * fact( n-1 );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int result = fact(n);
        System.out.println(result);
    }
}
