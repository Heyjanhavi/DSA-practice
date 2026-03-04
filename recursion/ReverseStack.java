/* Problem: You are given a stack of integers. Your task is to reverse the stack using recursion. You may only use standard stack operations (push, pop, top/peek, isEmpty). You are not allowed to use any loop constructs or additional data structures like arrays or queues.
Your solution must modify the input stack in-place to reverse the order of its elements.*/

import java.util.Stack;

public class ReverseStack {
    public static void insertAtBottom(Stack<Integer> stack, int value){
        if (stack.isEmpty()){
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack,value);
        stack.push(top);
    }
    public static void reverseStack(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        reverseStack(stack);
        System.out.println(stack);
    }
}
