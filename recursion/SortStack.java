/* Problem: You are given a stack of integers. Your task is to sort the stack in descending order using recursion, such that the top of the stack contains the greatest element. You are not allowed to use any loop-based sorting methods (e.g., quicksort, mergesort). You may only use recursive operations and the standard stack operations (push, pop, peek/top, and isEmpty).*/


import java.util.Stack;

public class sortStack {
    public static void insertSorted(Stack<Integer> stack, int value){
        if (stack.isEmpty() || stack.peek() < value){
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top);
    }

    public static void SortStack(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        SortStack(stack);
        insertSorted(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(200);
        stack.push(50);
        stack.push(99);

        SortStack(stack);
        System.out.println(stack);
    }

}
