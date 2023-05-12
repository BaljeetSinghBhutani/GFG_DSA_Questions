package GFG_DSA_Questions;

public class Min_Times_A_has_to_be_repeated_B_is_a_Substring_of_it {

    static int minRepeats(String A, String B) {


        int count  = 1;
        String str = A;

        while (A.length()<B.length()){
            A +=str;
            count++;

        }
        if(A.contains(B)){
            return count;
        }

        if(A.length()>=B.length()){
            A +=str;
            if(A.contains(B)){
                count++;
                return count;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
String A =  "wwwwwwww";
String B  =  "";
int a =  minRepeats(A, B);
        System.out.println(a);

String str1  =   "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
String str2  =  "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
        System.out.println(str1.length());
        System.out.println(str2.length());
    }
}
