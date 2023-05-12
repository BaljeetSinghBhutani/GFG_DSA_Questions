package GFG_DSA_Questions;

public class Make_Array_Elements_Equal {
    public long minOperations(int N) {
        long ans = 0;

long a  =  N/2;
if(a%2==0)
{
    long mean  = (2 *a)+1;
    int i= 0;
    while (i<a)
    {
        long diff  = mean  -  ((2*i)+1);

        ans+=diff;
        i++;
    }
}
else{
    long mean  = ((2 *a)+1 +  2 *(a-1) +1)/2;
    int i = 0;
    int x = (2 * i) +1;
    while(x<=mean)
    {
        long diff =  mean -  ((2 * i) +1);
        ans+=diff;
        i++;
    }
}


        return ans;


    }
    public static void main(String[] args) {

    }
}
