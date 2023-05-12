package GFG_DSA_Questions;

public class Power_of_2 {
    public static boolean isPowerofTwo(long n) {


// Method -1

        int a = Integer.bitCount((int) n);
        if (a == 0 || a == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
