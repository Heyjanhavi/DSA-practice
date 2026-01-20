/* Problem: Given a valid parentheses string s, your task is to remove the outermost parentheses from every primitive component of s and return the resulting string.
  Time complexity:O(n)
  Space complexity:O(n)    */


public class rmvoutrmstprnthsis {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" (hdgrjddhdb)");
        StringBuilder result = new StringBuilder();

        int n = sb.length();
        int count = 0;

        for (int i=0; i<n; i++){
            char c = sb.charAt(i);
            if ( c == '('){
                count++;
                if (count > 1){
                    result.append(c);
                }
            } else if (c == ')') {
                count--;
                if (count>0){
                    result.append(c);
                }

            }else {
                result.append(c);
            }

        }
        System.out.println(result);

    }
}
