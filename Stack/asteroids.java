/* Problem: We are given an array asteroids of integers representing asteroids in a row. The indices of the asteroid in the array represent their relative position in space.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.*/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a: asteroids){
            while (!stack.isEmpty() && a<0 && stack.peek() > 0){
                if (stack.peek() < -a){
                    stack.pop();
                    continue;
                }
                else if(stack.peek() == -a){
                    stack.pop();
                }
                a=0;
                break;
            }
            if (a!=0){
                stack.push(a);
            }
            
        }
        int[] result = new int[stack.size()];
            for (int i=stack.size()-1; i>=0; i--){
                result[i] = stack.pop();

            }
            return result;
        
    }
}
