package GFG_DSA_Questions;

public class Tower_of_Hanoi {


    public static long toh(int N, int from, int to, int aux) {

        int t1id = 1;
        int t2id  = 3;
        int t3id = 2;
      toh1(N,t1id, t2id, t3id);
      return (long) (Math.pow(2, N) -1);
//        return count;
    }

    public static void toh1(int N, int t1id, int t2id, int t3id) {
        if (N == 0) {
            return ;
        }
        toh1(N - 1, t1id, t3id, t2id);
        System.out.println("move disk " + N + " from rod " + t1id  +" to rod " + t2id);
        toh1(N - 1, t3id, t2id, t1id);

    }


    public static void main(String[] args) {
long a  =  toh(2, 1, 2, 3);
        System.out.println(a);

    }
}
