class Solution {
    private void reverse_arr(int[] nums,int i,int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k%=nums.length;
        reverse_arr(nums,0,n-k-1);
        reverse_arr(nums,n-k,n-1);
        reverse_arr(nums,0,n-1);
    }
}