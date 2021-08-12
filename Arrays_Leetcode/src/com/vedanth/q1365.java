package com.vedanth;
/*How many numbers are smaller thn current*/
public class q1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int arr[] = new int [nums.length];

        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]) c++;
            }

            arr[i] =c;
        }

        return arr;
    }
}
