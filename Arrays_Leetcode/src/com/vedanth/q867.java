package com.vedanth;
/*transpose of matrix*/
public class q867 {
    public int[][] transpose(int[][] m) {
        int a[][]=new int[m[0].length][m.length];
        int i,j;
        for(i=0;i<m.length;i++)
        {
            for(j=0;j<m[i].length;j++)
            {
                a[j][i]=m[i][j];
            }
        }
        return a;
    }
}
