package com.vedanth;
/*Concatenation of Array*/
public class q1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0;i < n;i++){
            ans[i] = ans[i+n] = nums[i];
        }

        return ans;
    }
}
