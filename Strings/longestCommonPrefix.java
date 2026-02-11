/* Problem:  Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".*/


import java.util.Arrays;
import java.util.Scanner;

public class lngstprefix {

    public static String longestCommonPrefix(String[] str){
        if (str == null || str.length ==0){
            return " ";
        }

        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];

        StringBuilder result = new StringBuilder();

        int length = Math.min(first.length(), last.length());

        for (int i=0; i<length; i++){
            if (first.charAt(i) != last.charAt(i))
                break;

            result.append(first.charAt(i));

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Flower", "Flow", "Flows"};
        System.out.println(longestCommonPrefix(arr));

    }
}
