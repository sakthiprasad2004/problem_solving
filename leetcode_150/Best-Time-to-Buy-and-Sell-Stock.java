class Solution {
    public int maxProfit(int[] prices) {
        int profit;
        int minprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int p : prices){
            if(p < minprice){
                minprice = p; // update the minimum value;
            }
            else {
                // 7 < 1 is false so it comes here
                // to add 1 
                profit = p - minprice; 
                // (1-7)
                 maxprofit = Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
        
    }
}

//procedure 
//first of all identify the min if not min then it get substrated to the min and find the max prfoti