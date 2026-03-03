/* Problem: Implement the power function pow(x, n) , which calculates the x raised to n i.e. xn.*/


import java.util.Scanner;
import static java.lang.Math.pow;

public class Exponent {
    public static int pow(int x, int n){
        if (n == 0){
            return 1;
        }
        return x * pow(x, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Enter the exponent");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("enter positive number");
        }else {
            int result = pow(x,n);
            System.out.println(result);
        }


    }
}
