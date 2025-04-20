class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 1;
        int peak,down,i=1;
        while(i < n){
           if (ratings[i]==ratings[i-1]){
                sum+=1;
                peak=1;
                i++;
                continue;
            }
            peak=1;
            while(i < n && ratings[i] > ratings[i-1]){
                peak+=1;
                sum+=peak;
                i++;
            }
            down=0;
            while(i < n && ratings[i] < ratings[i-1]){
                down+=1;
                sum+=down;
                i++;
            }
            if(down >= peak){
                sum+= down - peak + 1;
            }
        }
        return sum;
    }
}