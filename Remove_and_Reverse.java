package GFG_DSA_Questions;

import java.util.HashMap;

public class Remove_and_Reverse {
    String removeReverse(String S)
    {

  StringBuffer s = new StringBuffer(S);
  int freq[]=  new int[26];

for(int i=0; i<s.length(); i++)
{
    char ch  =  s.charAt(i);
    freq[ch-'a']++;
}
//logic
int flag = 0;
int start = 0;
int end  = s.length();
while(start<=end) {
    if (flag == 0) {
        if (freq[s.charAt(start) - 'a'] == 1) {
            start++;
        } else {
            freq[s.charAt(start) - 'a']--;
            s.replace(start, start + 1, "#");
            start++;
            flag = 1;
        }
    } else {
        if (freq[s.charAt(end) - 'a'] == 1) {
            end--;
        } else {
            freq[s.charAt(end) - 'a']--;
            s.replace(end, end + 1, "#");
            end--;
            flag = 0;
        }

    }
}
if(flag==1)
{
    s.reverse();
}

String ans  = "";
for(int i =0; i<s.length(); i++)
{
    if(s.charAt(i)!='#')
    {
        ans+=s.charAt(i);
    }
}
return ans;

}



    public static void main(String[] args) {

    }
}
