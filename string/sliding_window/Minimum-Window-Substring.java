class Solution {
    public String minWindow(String s, String t) {
       if(s.length() < t.length()) return "";
       Map<Character,Integer> mpp = new HashMap<>();
       int l=0,r=0,min_len=Integer.MAX_VALUE,s_index = -1,count=0;
       for(int i=0;i<t.length();i++){
        char char_t = t.charAt(i);
        mpp.put(char_t,mpp.getOrDefault(char_t,0)+1);
       }
       while(r < s.length()){
        char char_r = s.charAt(r);
        if(mpp.containsKey(char_r)){
            mpp.put(char_r,mpp.get(char_r)-1);
            if(mpp.get(char_r) >= 0) count++;
        }
            else mpp.put(char_r,-1);
            while(count == t.length()){
                if(r-l+1 < min_len){
                    min_len = r - l + 1;
                    s_index = l;
                }
                char char_l = s.charAt(l);
                if(mpp.containsKey(char_l)){
                    mpp.put(char_l,mpp.getOrDefault(char_l,0)+1);
                    if(mpp.get(char_l) > 0)  count--;
                   
                }
                l++;
            }
            r++;
       }
       return s_index == -1 ? "" : s.substring(s_index,s_index+min_len);
    }
}