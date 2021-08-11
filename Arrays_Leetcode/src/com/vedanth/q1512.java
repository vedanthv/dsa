package com.vedanth;
/*Number of Good Pairs*/
public class q1512 {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){ //to satisfy condition that i < j
                if(nums[i] == nums[j]){
                    res++;
                }
            }
        }
        return res;
    }

}
