class Solution {
  
    public String longestPalindrome(String s) {
        String res = "";
        int max_len = 0;
        char[] ch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            int l = i,r = i;
            //odd
            while(l>=0 && r < s.length() && ch[l]==ch[r]){
                if(r-l+1 > max_len){
                     res = s.substring(l,r+1);
                    max_len = r-l+1;
                   
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;

            //even
            while(l >= 0 && r < s.length() && ch[l] == ch[r]){
               
                if(r-l+1 > max_len){
                    res = s.substring(l,r+1);
                    max_len = r-l+1;
                    
                }
                l--;
                r++;
            }
        }
        return res;
    }
}