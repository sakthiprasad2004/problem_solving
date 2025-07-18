class Solution {
    public boolean ispalindrome(String s, int l , int r){
        while(l < r){
            if(s.charAt(l)!= s.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length()-1;
         while(l < r){
            if(s.charAt(l) == s.charAt(r) ){
                l++;r--;
            }
            else return ispalindrome(s,l+1,r) || ispalindrome(s,l,r-1);
        }
        return true;

    }
}