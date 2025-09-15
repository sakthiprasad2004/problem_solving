class Solution {
    public boolean isValid(String word) {
        if(word == null || word.length() < 3) return false;
        boolean hasvowel =  false;
        boolean hascons = false;
       
        for(char c : word.toCharArray()){
            if(Character.isDigit(c)){
                continue;
            }

         if(!Character.isLetter(c)){
                return false;
            }
             if(isVowel(c)){
                hasvowel =  true;
            }
            else hascons = true;
           
           
            
        }
        return hasvowel&&hascons;
    }

    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c== 'e' || c == 'i' || c=='o' || c=='u';
    }
}