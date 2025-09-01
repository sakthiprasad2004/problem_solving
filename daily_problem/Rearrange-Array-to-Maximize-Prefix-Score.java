class Solution {
    public int maxScore(int[] nums) {
        long presum = 0;
        int count=0;
        Arrays.sort(nums);
        
        for(int i=nums.length - 1;i >= 0;i--){
           presum += nums[i];
           if(presum > 0) count++;
           else break;
        }
        
        return count;
    }
}