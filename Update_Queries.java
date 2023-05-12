package GFG_DSA_Questions;

public class Update_Queries {
    int [] updateQuery(int N, int Q, int [][]U){

        int arr[] = new int [N];
        int k  =0;
        int j  =0;
        while(k<Q){
            for(int i =  U[k][0]; i<=U[k][1]; i++)
            {
                arr[j] = U[k][2]|arr[j];
            }
            k++;
        }
        return arr;



    }
    public static void main(String[] args) {

    }
}
