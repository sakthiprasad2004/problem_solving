class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int l = 0 , r = s.length();
       while(l < r){
        if(s.charAt(l)!=s.charAt(r-1)) return false;
        l++;r--;
       }
       return true;
       
    }
}