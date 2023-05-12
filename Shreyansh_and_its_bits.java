package GFG_DSA_Questions;

import java.util.Arrays;

public class Shreyansh_and_its_bits {




    long arr[][];
    long count(long n) {

        // Method -2
        arr = new long[40][40];
        for (int i = 0; i < 40; i++)
            Arrays.fill(arr, -1);
int one  = 0;
int bor = 0;
long ans = 0;

while(n>0){
    if((n&1)==1)
    {

        one++;
        ans+=ncr(bor, one);
    }
    bor++;
    n/=2;
}

return ans;
    }

    long ncr(int n, int r)
    {
        if(r==0 ||  n==r)
        {
            return 1;
        }
if(r>n){
    return 0;
}
if(arr[n][r]!=-1)
{
    return arr[n][r];
}
        return  arr[n][r]=  ncr(n-1, r-1) + ncr(n-1, r);

    }


//    long count(long n)
//    {
//Method -1

//      int count  = 0;
////   long setbits = Integer.bitCount((int) n);
//for(int i  =1; i<n; i++)
//{
//    long res = Integer.bitCount(i);
//    if(res == setbits)
//    {
//        count++;
//    }
//}
//
//return count;

//    }
    public static void main(String[] args) {

    }
}
