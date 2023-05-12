package GFG_DSA_Questions;

public class Last_Modified_Ball {
    int solve(int N, int[] A) {
   for(int i = A.length-1; i>=0; i--)
   {
       if(A[i]<9)
       {
           return i + 1;
       }
   }
return -1;
    }
    public static void main(String[] args) {

    }
}
