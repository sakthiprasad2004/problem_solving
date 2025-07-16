class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int l=0,r=0,max_freq=0,max_len=0;
        while(r < s.length()){
            hash[s.charAt(r)-'A']++;
            max_freq = Math.max(max_freq,hash[s.charAt(r)-'A']);
            while((r-l+1)- max_freq > k ){
                hash[s.charAt(l)-'A']--;
                max_freq = 0;
                for(int i=0;i<26;i++){
                    max_freq = Math.max(max_freq,hash[i]);
                }
                l++;
            }
            if((r-l+1)- max_freq <= k) {
                max_len=Math.max(max_len,r-l+1);


            }
            r++;
        }
        return max_len;
    }
}