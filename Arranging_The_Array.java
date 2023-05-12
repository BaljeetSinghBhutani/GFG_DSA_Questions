package GFG_DSA_Questions;

public class Arranging_The_Array {
    public void Rearrange(long a[], long n)
    {
long count1 = 0;
long count2 = 0;
       for(int i =0; i<n; i++)
       {
           if(a[i]<0){
//               swap
count1++;
           }
           else {
               count2++;
           }

       }
      long arrN[] =  new long [(int) count1];
      long arrP[] = new long [(int) count2];

       int k1= 0;
       int k2 = 0;
       for(int i  =0; i<a.length; i++)
       {
           if(a[i]<0)
           {
               arrN[k1] = a[i];
k1++;
           }
           else{
               arrP[k2] = a[i];
               k2++;
           }
       }
        int  i ;
       for( i =0;i< arrN.length; i++){
           a[i] = arrN[i];
       }
       for(int  k =0; k< arrP.length; k++){
           a[i] = arrP[k];
           i++;
       }

    }
    public static void main(String[] args) {

    }
}
