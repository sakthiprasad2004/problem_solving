class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        Arrays.sort(coins);
        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            int mini = Integer.MAX_VALUE-1;
            for(int c : coins){
                int diff = i - c;
                if(diff < 0) break;
                mini= Math.min(mini,dp[diff]+1);

                // System.out.print(i +", "+c+":"+ dp[i]);
            }
            dp[i]=mini;
            // System.out.println();
        }
        return(dp[amount] > amount) ? -1 : dp[amount] ;
    }
}