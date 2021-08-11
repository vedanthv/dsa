package com.vedanth;
/*IMPORTANT ARRAY PROBLEM : Shuffle the Array*/
public class q1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i = 0;i < 2*n;i++){
            if(i % 2 == 0){
                result[i] = nums[i/2];
            }
            else
                result[i] = nums[n+i/2];
        }
        return result;
    }
}
