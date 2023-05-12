package GFG_DSA_Questions;

import java.util.*;

public class Cutting_Rectangles {
    static List<Long> minimumSquares(long L, long B)
    {

List<Long> ans = new ArrayList<>();

//long k =1;
long min = Math.min(L, B);
long k1 = 1, res  =  1,  L1 = L, B1 =  B;
while(k1<=min)
{
    if(L1%k1==0 && B1%k1==0)
    {
        res*=k1;
        L1=  L1/k1;
        B1 = B1/k1;
        k1 = 1;
        min = Math.min(L1, B1);
    }

        k1++;

}







long areaRectangle = L*B;
long areaSquare = res *  res;

long number = (long)areaRectangle /areaSquare ;

ans.add(number);
ans.add(res);
return ans;

    }
    public static void main(String[] args) {
List<Long> list  = minimumSquares(27, 6);
        System.out.println(list);

    }
}
