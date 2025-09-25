class Solution {
    public int removeElement(int[] nums, int val) {
        int i,j;
        for( i=0,j=0;i<nums.length;i++){
            if(nums[i]==val) continue;
            else if(j < nums.length) nums[j++] = nums[i];
        }
        return j;
    }
}