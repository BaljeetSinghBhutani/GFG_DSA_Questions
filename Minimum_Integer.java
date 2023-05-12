package GFG_DSA_Questions;

public class Minimum_Integer {
    public static int minimumInteger(int N, int[] A) {

int ans = Integer.MAX_VALUE;
long sum  = 0;
        for (Integer itr:A) {
            sum+=itr;
        }

        long div =  sum/N;
        long temp  = 0;
        if(sum == div *  N)
        {
            temp  = div;
        }
        else{
            temp =  div+1;
        }

        for(int i = 0; i<A.length; i++)
        {

            if(A[i]>=temp)
            {
                ans = Math.min(A[i], ans);
            }


        }

return ans;
    }
    public static void main(String[] args) {
int arr[] = {4, 7, 5, 7, 4, 8, 3, 1, 1, 1};
int a  = minimumInteger(arr.length, arr);
        System.out.println(a);

    }
}
