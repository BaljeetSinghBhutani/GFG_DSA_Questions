package GFG_DSA_Questions;

public class Binary_Modulo {
   static int modulo(String s, int m) {
        long decimal = 0;
        long k = 0;

        for(int i = s.length()-1; i>=0; i--)
        {
            int a =  s.charAt(i)-'0';
            decimal+=a*(Math.pow(2,k));
            k++;

        }

        return (int)decimal%m;


    }
    public static void main(String[] args) {
String s = "101";
int m =  2;

int ans  = modulo(s, m);
        System.out.println(ans);
    }
}
