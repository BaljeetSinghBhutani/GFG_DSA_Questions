package GFG_DSA_Questions;

public class Count_the_Substrings {
  static   int countSubstring(String S) {
        // code here

        {

            int ans = 0;

            for (int i = 0; i < S.length(); i++) {
                int counts = 0;
                int countc = 0;
                for (int j = i; j < S.length(); j++) {
                    int ch = S.charAt(j);
                    if (ch >= 97 && ch <= 122) {
                        counts++;
                    } else {
                        countc++;
                    }
                    if (counts == countc) {
                        ans++;

                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
String ch = "gEEk";
int a = countSubstring(ch);
        System.out.println(a);
//        System.out.println(ch);

  }
}
