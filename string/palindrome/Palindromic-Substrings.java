class Solution {
    public int countSubstrings(String s) {
    
        int res = 0;
        for(int i=0;i<s.length();i++){
           res +=  count_palindrome( s, i,i);
           res +=   count_palindrome( s, i,i+1);
        }
        
        return res;
    }

    public int count_palindrome(String s,int l,int r){
        int count = 0;
        while(l >=0 &&  r < s.length()  && s.charAt(l)==s.charAt(r)){
            count++;
            l--;
            r++;
        }
        return count;
    }
}