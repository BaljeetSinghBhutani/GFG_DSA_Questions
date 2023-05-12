package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }
}
public class Fractional_Knapsack {

    double fractionalKnapsack(int W, Item arr[], int n)
    {
double ratio[][] = new double[arr.length][2];
for(int i =0; i< n; i++){
    ratio[i][0] = i;
    ratio[i][1] = arr[i].value/(double)arr[i].weight;
}
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

int capacity = W;
double value  = 0;
for(int i = ratio.length-1; i>=0; i--)
{

    double ind  =  ratio[i][0];

    if(capacity>=arr[(int)ind].weight){
        value+=arr[(int) ind].value;
        capacity-=arr[(int)ind].weight;
    }
    else{
        value+=ratio[i][1] * capacity;
        capacity = 0;
    }

}

return value;
    }
    public static void main(String[] args) {

    }
}
