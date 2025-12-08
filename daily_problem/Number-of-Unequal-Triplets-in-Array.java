1class Solution {
2    public int unequalTriplets(int[] nums) {
3        int count= 0;
4        int n=nums.length;
5        for(int i=0;i<n-2;i++){
6            for(int j=i+1;j<n-1;j++){
7                for(int k=j+1;k<n;k++){
8                    if(nums[i] != nums[j] &&  nums[i] != nums[k] && nums[j] != nums[k]) count++;
9                }
10            }
11        }
12        return count;
13    }
14}