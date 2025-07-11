class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0,r=0,maxi=0;
        while(r < s.length()){
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                maxi = Math.max(maxi,r-l+1);
                r++;
            }
            else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxi;
    }
}