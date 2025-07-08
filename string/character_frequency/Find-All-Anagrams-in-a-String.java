class Solution {
    public List<Integer> findAnagrams(String s, String p) {
          int n = s.length();
          int m = p.length();
          if(n < m) return new ArrayList<>();
          int[] p_freq = new int[26];
          int[] s_freq = new int[26];
          for(int i=0;i<m;i++){
            p_freq[p.charAt(i)-'a']++;
            s_freq[s.charAt(i)-'a']++;
          }

          List<Integer> res = new ArrayList<>();
          if(Arrays.equals(p_freq,s_freq)) res.add(0);
          for(int i=m;i<n;i++){
            s_freq[s.charAt(i)-'a']++;
            s_freq[s.charAt(i-m)-'a']--;
             if(Arrays.equals(p_freq,s_freq)){
            res.add(i-m+1);
          }
          }
         
          return res;
    }
}