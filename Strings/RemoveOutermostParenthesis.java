/* Problem: Given a valid parentheses string s, your task is to remove the outermost parentheses from every primitive component of s and return the resulting string.
  Time complexity:O(n)
  Space complexity:O(n)    */


import java.util.Scanner;

public class rmvoutrmstprnthsis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int count =0;

        for (char c: s.toCharArray()){
            if (c == '('){
                if (count > 0){
                    result.append(c);

                }
                count++;

            }else {
                count--;
                if (count > 0){
                    result.append(c);
                }
            }
        }
        System.out.println(result.toString());
    }
}
