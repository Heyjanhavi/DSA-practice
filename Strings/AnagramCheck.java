/* Problem:  Given two strings, check if two strings are anagrams of each other or not. */

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    public static boolean IsAnagram(String s, String t){

        if (s.length() != t.length()){
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Array");
        String s = sc.nextLine();
        System.out.println("Enter second Array");
        String t = sc.nextLine();

        if (IsAnagram(s,t)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not an Anagram");
        }
    }
}
