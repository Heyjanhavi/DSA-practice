/* Problem: find the next greater elemetn to the right of the current elemetn*/

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void NextElement(int[] arr){

        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<arr.length; i++){
            while (!stack.isEmpty() && arr[i] > stack.peek()){
                System.out.println(stack.pop() + "->" + arr[i]);
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop() +"-> -1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("enter the array");
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        NextElement(nums);

    }
}
