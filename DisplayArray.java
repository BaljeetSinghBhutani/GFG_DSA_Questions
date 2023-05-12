package GFG_DSA_Questions;

public class DisplayArray {
    public static void displayArr(int arr[], int index)
    {
        if(index== arr.length)
        {
            return;
        }

        System.out.println(arr[index]);
        displayArr(arr, index+1);
    }
    public static void main(String[] args) {
int arr[] = {1, 2, 3, 4};
displayArr(arr, 0);
    }
}
