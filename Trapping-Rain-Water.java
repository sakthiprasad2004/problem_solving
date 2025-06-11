class Solution {
    public int trap(int[] height) {
        int[] left = leftmax(height);
        int[] right = rightmax(height);
        int total = 0;
        int n = height.length;
        for(int i=0;i<n;i++){
            total+=Math.min(left[i],right[i]) - height[i];
        }
        return total;
    }
    static int[] leftmax(int[] height){
        int n = height.length;
        int[] premax = new int[n];
        premax[0] = height[0];
        for(int i=1;i<n;i++){
            premax[i]=Math.max(premax[i-1],height[i]);
        }
        return premax;
    }
    static int[] rightmax(int[] height){
        int n = height.length;
        int[] premax = new int[n];
        premax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            premax[i]=Math.max(premax[i+1],height[i]);
        }
        return premax;
    }

}