package GFG_DSA_Questions;

public class Magic_Triplest {

    public int countTriplets(int[] nums) {


//        Method -2
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i - 1;
            int k = i + 1;

            int sumj = 0;
            int sumk = 0;

            while (j >= 0) {
                if (nums[j] > nums[i]) {
                    sumj++;
                }

            }

            while (k < nums.length) {
                if (nums[j] < nums[k]) {
                    sumk++;
                }
            }
            count += sumj * sumk;

        }

        return count;
    }

//        Method -1

//        int count = 0;
//        for(int i =0; i<nums.length; i++)
//        {
//            for(int j =i+1; j< nums.length;j++)
//            {
//                if(nums[i]<nums[j]) {
//                    for (int k = j + 1; k < nums.length; k++) {
//                        if (nums[j] < nums[k]) {
//                            count++;
//                        }
//                    }
//                }
//            }
//        }
//        return count;
//

//}
    public static void main(String[] args) {

    }
}

