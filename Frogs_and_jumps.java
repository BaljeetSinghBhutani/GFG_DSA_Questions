package GFG_DSA_Questions;

public class Frogs_and_jumps {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {

        int count= 0;

        boolean flag[] = new boolean[N+1];
        flag[0] =  true;

        for(int i =0; i< frogs.length; i++)
        {
            int fj =  frogs[i];
            int k = 1;
            int chk =  fj *k;
            while (chk<leaves)
            {
               if(chk<flag.length)
               {
                   flag[chk] = true;
               }
               k++;
               chk = chk*k;

            }
        }

        for(int i =0; i<flag.length; i++)
        {
            if(!flag[i])
            {
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {

    }
}
