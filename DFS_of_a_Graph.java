package GFG_DSA_Questions;

import java.util.ArrayList;

public class DFS_of_a_Graph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean visited[] = new boolean[adj.size()];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                DFSHelper(V, visited, adj, i, list);
            }
        }
        return list;
    }

    private void DFSHelper(int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj, int sv, ArrayList<Integer> list) {
        list.add(sv);
        visited[sv] = true;

        for (int i = 0; i < adj.size(); i++) {
            if (adj.get(sv).get(i) == i && !visited[i]) {
                DFSHelper(v, visited, adj, i, list);
            }
        }

    }

    public static void main(String[] args) {

    }

}