package com.vedanth;

public class flipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                res[i][j] = image[i][image[0].length - j -1];

                if(res[i][j] == 1){
                    res[i][j] = 0;
                }else{
                    res[i][j] = 1;
                }
            }
        }
        return res;
    }
}
