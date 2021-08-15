package com.vedanth;

public class highestAltitude {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;

        for(int i = 0;i < gain.length;i++)
        {
            sum += gain[i]; // altitudes are the sum of the gains before i. This is called prefix sum method
            if(sum > max)
                max = sum;
        }
        return max;
    }
}
