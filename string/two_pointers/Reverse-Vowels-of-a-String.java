class Solution {
    public boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        int l = 0 , r = s.length() - 1;
        char[] char_c = s.toCharArray();
        while(l < r){
           if(!isvowel(char_c[l])) l++;
           else if(!isvowel(char_c[r]))r--;
           else{
            char temp = char_c[l];
            char_c[l] = char_c[r];
            char_c[r] = temp;
            l++;r--;
           }
        }
        return new String(char_c);
    }
}