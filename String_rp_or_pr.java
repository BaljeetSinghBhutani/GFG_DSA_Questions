package GFG_DSA_Questions;

import java.util.Stack;

public class String_rp_or_pr {
    static long solve(int X,int Y, String S)
    {

long ans = 0;
String s1= "pr";
String s2 ="rp";

if(X<Y)
{
    int temp  =X;
    X = Y;
    Y = temp;

    String t =  s1;
    s1 = s2;
    s2 =  t;
}
Stack<Character> st  = new Stack<>();

for(int i = S.length()-1 ; i>=0; i--)
{
    Character curr = S.charAt(i);
   char first = s1.charAt(0);
   char second =  s1.charAt(1);

if(st.size()>0 && curr == first &&  st.peek()==second)
{

    st.pop();
    ans+=X;


}
else{
    st.push(curr);
}
}

StringBuilder rem  = new StringBuilder();
while(!st.isEmpty())
{
    rem.append(st.pop());
}

        for(int i = rem.length()-1 ; i>=0; i--) {
            Character curr = rem.charAt(i);
            char first = s2.charAt(0);
            char second = s2.charAt(1);

            if (st.size() > 0 && curr == first && st.peek() == second) {

                st.pop();
                ans += Y;


            } else {
                st.push(curr);
            }
        }




return ans;

    }
    public static void main(String[] args) {

    }
}
