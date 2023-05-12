package GFG_DSA_Questions;

public class Bit_Difference {
    private static String  BinaryConversion(int n){
        String output = "";
        int k  = n;
 while(n>=1){
     k  = n%2;
     n = n/2;
     output  = k+ output;

 }
        return output;
    }
    public static int countBitsFlip(int a, int b){
        int count  =0;
      String c =  BinaryConversion(a);
        System.out.println(c);
      String d  = BinaryConversion(b);
        System.out.println(d);
      while(c.length()<d.length())
      {

          c = '0' +c;
      }
while(d.length()<c.length())
{
    d = '0' + d;
}
for(int i =0; i<c.length(); i++)
{
    if(d.length()>=i && c.charAt(i)!=d.charAt(i)){
        count++;
    }
}
return count;
    }
    public static void main(String[] args) {
        int  a  =countBitsFlip(34, 7);
        System.out.println(a);
    }
}
