package com.vedanth;
//Richest Customer Wealth
public class q1672 {
        public int maximumWealth(int[][] accounts) {
            int wealth = 0;
            for(int i = 0;i <= accounts.length -1;i++)
            {
                int inner_wealth = 0;
                for(int j = 0; j <= accounts[i].length - 1; j++)
                {
                    inner_wealth += accounts[i][j];
                }
                wealth = Math.max(wealth,inner_wealth);

            }
            return wealth;
        }
    }

