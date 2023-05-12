package GFG_DSA_Questions;

import java.util.Stack;

public class Reverse_a_String_Using_Stack {
    public static  String reverse(String S){
Stack<Character> stack = new Stack<>();
for(int i =0; i<S.length(); i++)
{
    stack.push(S.charAt(i));
}
String s = "";
while(!stack.isEmpty())
{
    s   += stack.pop() ;
}
return s;
    }
    public static void main(String[] args) {
String s  = "Geeks";
        System.out.println(reverse(s));
    }
}
