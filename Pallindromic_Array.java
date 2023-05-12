package GFG_DSA_Questions;

public class Pallindromic_Array {
    public static int palinArray(int[] a, int n)
    {
        for(int  i =0; i<a.length; i++){
int b = a[i];
int count = 0;
while(b>0){
    b= b/10;
    count++;
}
b= a[i];
int arr[] = new int [count];
for(int j = count-1; j>=0; j--)
{
    int c = b/10;
 b= b%10;
 arr[j]= b;
 b=c;
}

int k = 0;
int l = count-1;

while(k<=l)
{
    if(arr[k]!=arr[l])
    {
        return 0;
    }
    k++;
    l--;
}
        }



        return 1;
    }
    public static void main(String[] args) {
int a [] = {111, 121, 222,232};
int b = palinArray(a, 1);
        System.out.println(b);
    }
}
