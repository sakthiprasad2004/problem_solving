class Solution {
    private Map<Integer,Integer> mpp = new HashMap<>();
    public int climbStairs(int n) {

        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        if(mpp.containsKey(n)) return mpp.get(n);
        int onestep = climbStairs(n-1);
        int secondstep = climbStairs(n-2);
        int res = onestep + secondstep;
        mpp.put(n,res);
        return res;

    }
}