package GFG_DSA_Questions;

import java.util.Stack;

public class Implement_Stack_Using_Array {
    class MyStack
    {
        int top;
        int arr[] = new int[1000];
Stack<Integer> stack = new Stack<>();
        MyStack()
        {
            top = -1;
        }

        //Function to push an integer into the stack.
        void push(int a)
        {
            // Your code here

            stack.push(a);

        }

        //Function to remove an item from top of the stack.
        int pop()
        {
            // Your code here
            int a = -1;
            if(!stack.isEmpty()) {
                a = stack.pop();
            }


                    return a;
        }
    }
    public static void main(String[] args) {

    }
}
