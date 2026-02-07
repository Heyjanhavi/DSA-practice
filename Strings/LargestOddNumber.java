/* Problem:  Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.
The number returned should not have leading zero's. But the given input string may have leading zero. */

import java.util.Scanner;

public class lrgstoddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int n = s.length();

        int index = -1;

        for (int i=n-1; i>=0; i--){

            char c = s.charAt(i);

            if ((c - '0')%2 == 1){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("No odd number forund");

        }else {
            String result = s.substring(0, index+1);
            System.out.println(result);
        }
    }
}
