package GFG_DSA_Questions;

import java.util.ArrayList;

public class Number_of_Good_Components {

    int V_count;
    int E_count;
    boolean visited[] ;
    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {

visited = new boolean[V+1];
int ans  = 0;
     for(int i =1; i<=V; i++){
         V_count = 0;
         E_count = 0;

         if(!visited[i])
         {
             dfs(adj, i);
         }
         if(E_count ==  V*(V-1)){
             ans++;
         }
         V_count = 0;
         E_count = 0;

     }

         return ans;
    }

    private void dfs(ArrayList<ArrayList<Integer>> adj, int i) {
visited[i] =  true;
        V_count++;
        E_count+= adj.get(i).size();

for (int nei:adj.get(i))
{
    if(!visited[i])
    {
        dfs(adj, nei);
    }

}




    }


    public static void main(String[] args) {

    }
}
