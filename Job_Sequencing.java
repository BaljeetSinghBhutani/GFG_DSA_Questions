package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
public class Job_Sequencing {
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a, b)-> b.profit-a.profit);
int maxdeadline = 0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i].deadline>maxdeadline)
            {
                maxdeadline = arr[i].deadline;
            }
        }

        int deadline[] = new int[maxdeadline +1];
        for(int i=0; i<deadline.length;i++)
        {
            deadline[i] = -1;
        }

        int count  =0;
        int profit  =0;

        for(int i =0; i<arr.length; i++)
        {
            for(int j = arr[i].deadline; j>0;j--){
                if(deadline[j]==-1)
                {
                    deadline[j] = arr[i].id;
                    count++;
                    profit+=arr[i].profit;
                    break;

                }
            }
        }

int ans[] = new int[2];
        ans[0] =  count;
                ans[1] = profit;

                return ans;

    }
}
