package GFG_DSA_Questions;

public class Break_a_Number {
    int waysToBreakNumber(int N){
        // code here
        long m = 1000000007;
        N = (int) ((N+1) % m);
        return (int) ((N %m* (N+1) %m /2) %m);
    }
    public static void main(String[] args) {

    }
}
