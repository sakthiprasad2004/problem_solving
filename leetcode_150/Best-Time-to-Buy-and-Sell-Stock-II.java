class Solution {
    public int maxProfit(int[] prices) {
        int sum =0;
        int n = prices.length;
        int minprice = prices[0];
        int total = 0,profit=0;
        for(int i=1;i<n;i++){
            if(prices[i] > minprice){
                total += prices[i] - minprice;
            
            }
           minprice = prices[i];
        }
        return total;
    }
    
}