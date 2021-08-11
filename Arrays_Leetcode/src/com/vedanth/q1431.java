package com.vedanth;
/*IMPORTANT : Kids with greatest number of candies*/
//Not fully space optimized
import java.util.ArrayList;
import java.util.List;

public class q1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> list=new ArrayList<Boolean>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
