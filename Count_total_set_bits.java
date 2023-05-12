package GFG_DSA_Questions;

public class Count_total_set_bits {
    public static int countSetBits(int n){
// Method -2
if(n==0) {
    return 0;
}
long x =  tillpowerof2(n);
        long numberofsetbitslessthanpowerof2 = (1<<x-1)*x;
        long numberofMSB  = ((n - (1<<x)) +1);
        long remaining =  countSetBits(n- (1<<x));
        return (int) (numberofsetbitslessthanpowerof2 + numberofMSB + remaining);
    }
    public static long tillpowerof2(long n) {
        long x = 0;
        while ((1 << x) <= n) {
            x++;

        }
        return x - 1;
    }



// Method -1
//int count  = 0;
//for(int i = 1; i<=n; i++)
//{
//    int a  = Integer.bitCount(i);
//    count+=a;
//}
//return count;
//    }
    public static void main(String[] args) {
int n  = 17;
int  a = countSetBits(n);
        System.out.println(a);
    }
}
