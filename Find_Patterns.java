package GFG_DSA_Questions;

public class Find_Patterns {
    static int numberOfSubsequences(String s, String w){


        int ans  = 0;
        boolean []result = new boolean[s.length()];

        for(int i =0; i<s.length()-1; i++){

            if(s.charAt(i)==w.charAt(0) && !result[i])
            {
                result[i]= true;
                int j= i+1;
                int k =1;


                while(j<s.length()){

                    if(k<w.length() && s.charAt(j)==w.charAt(k) && !result[j])
                    {
                        k++;
                        result[j] = true;
                    }
                    j++;
                }

                if(k==w.length()){
                    ans++;
                }
            }
        }


        return ans;



    }


    public static void main(String[] args) {

    }
}
