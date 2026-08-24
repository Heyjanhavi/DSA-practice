//Given a String, count the number of consonants.

import java.util.*;

public class CountConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ednter the string:");
        String s = sc.nextLine();

        int count=0;
        s = s.toLowerCase();

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') &&
                 !(c == 'a' ||
                   c == 'e'||
                   c == 'i' ||
                   c == 'o' ||
                   c == 'u')){
                count++;
            }
        }
        System.out.println(count);
    }
}
