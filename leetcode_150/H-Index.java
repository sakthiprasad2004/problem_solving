class Solution {
    public int hIndex(int[] citations) {
        int count = 0;
        int n = citations.length;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int val = citations[n-i-1];
            if(val >= i+1) count = i+1;
            else break;
            
        }
        return count;
    }
}