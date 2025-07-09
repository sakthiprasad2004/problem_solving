class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int m = s.length();
        int n = p.length();
        if(m < n) return res;
        char[] p_arr = p.toCharArray();
        Arrays.sort(p_arr);
        String sorted_p = new String(p_arr);
        for(int i=0;i<=m-n;i++){
            char[] window = s.substring(i,i+n).toCharArray();
            Arrays.sort(window);
            String window_p = new String(window);
            if(sorted_p.equals(window_p)){
                res.add(i);
            }
        }
        return res;
    }
}