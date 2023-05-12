package GFG_DSA_Questions;

public class Container_with_most_water {
    long maxArea(int A[], int len){

        if(A.length==1)
        {
            return 0;
        }

      int i =0;
      int j =A.length-1;
//      long ans = 0;
      long area = 0;

      while(i<j)
      {
          int width = j-i-1;
          int height = Math.min(A[i], A[j]);
          long newarea = width * height;
          area = Math.max(area, newarea);

          if(A[i]<=A[i+1])
          {
              i++;
          }
          else {
              j++;
          }
      }
return area;
    }
    public static void main(String[] args) {

    }
}
