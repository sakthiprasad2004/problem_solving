class Solution {
    public int findCenter(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];
        if(first[0]==second[0]) return first[0];
        if(first[1]==second[0]) return first[1];
        if(first[1]==second[1]) return first[1];
        if(first[0]==second[1]) return first[0];
        return -1;

    }
}