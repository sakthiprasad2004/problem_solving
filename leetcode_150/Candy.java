class Solution {
    public int candy(int[] ratings) {
       //peak -> count the increase order
       //down -> count the decrease prder
       int i=1,peak,down,n = ratings.length,sum=1;
       while(i < n){
      

        if(ratings[i]==ratings[i-1]){
            peak = 1;
            sum += 1;
            i++;
            continue;
        }
        peak = 1;
        while(i < n && ratings[i] > ratings[i-1]){
            peak += 1;
            sum += peak;
            i++;
        }
        down = 0;
        while(i < n && ratings[i] < ratings[i-1]){
            down++;
            sum += down;
              i++;
        }
        if(down >= peak){
            sum += down - peak + 1;
        }
       }
       return sum;
    }
}