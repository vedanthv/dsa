package com.vedanth;

public class diagonalSum {
        public int diagonalSum(int[][] mat) {
            int sum = 0;
            for(int i = 0;i < mat.length;i++)
            {
                for(int j = 0;j < mat.length;j++)
                {
                    if(i == j || i+j == mat.length - 1 )
                    {
                        sum = sum + mat[i][j];
                    }
                }
            }
            return sum;
        }
    }

