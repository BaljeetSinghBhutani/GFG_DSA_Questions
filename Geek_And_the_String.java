package GFG_DSA_Questions;

import java.util.Stack;

public class Geek_And_the_String {
    public static String removePair(String s) {
   Stack<Character> stack = new Stack<>();
   String ans= "";

for(int i =0; i<s.length(); i++)
{
    char j  = s.charAt(i);
    if(!stack.isEmpty() && stack.peek()==j)
    {
        stack.pop();
    }
    else{
        stack.push(j);
    }
}

if(stack.isEmpty())
{
    return "-1";
}
while(!stack.isEmpty())
{
    ans =  stack.pop() +  ans;
}
return ans;
    }
    public static void main(String[] args) {
String str  ="aaabbaaccd";
String ans  =removePair(str);
        System.out.println(ans);
    }
}
