/* Check if a String is a Palindrome

A palindrome reads the same forwards and backwards.

madam → palindrome ✅
racecar → palindrome ✅
hello → not palindrome ❌ */

import java.util.*;

public class IsPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();

        int left = 0;
        int right = s.length()-1;
        char[] c = s.toCharArray();
        boolean isPalindrome = true;

        while (left < right){
            if (c[left] != c[right]){
                isPalindrome = false;
                break;

            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
