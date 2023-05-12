package GFG_DSA_Questions;

public class Type_it {
    int minOperation(String s) {
        boolean isvalid = true;
        int ans  = s.length();

        for(int i=0; i<s.length()/2; i++)
        {
            for(int j = 0; j<=i && isvalid; j++)
            {
                if(s.charAt(j)!=s.charAt(j+i+1))
                    isvalid = false;
                }


            if(isvalid){
                ans = ans - i;
            }
        }
return ans;



    }
    public static void main(String[] args) {

    }
}
