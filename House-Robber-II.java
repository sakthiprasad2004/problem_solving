class Solution {
    public int rob(int[] nums) {
       int n = nums.length;
       if(n==0) return 0;
       if(n==1) return nums[0];
       int max_1 = roblinear(nums,0,n-2);
       int max_2 = roblinear(nums,1,n-1);
       return Math.max(max_1,max_2);

    }
    public int roblinear(int[] nums,int start,int end){
        int n = end - start + 1;
        if(n==1) return nums[start];
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start],nums[start+1]);
        for(int i=2;i<n;i++){
          dp[i] = Math.max(dp[i-1],nums[i+start]+dp[i-2]);
        }
        return dp[n-1];
    }
}