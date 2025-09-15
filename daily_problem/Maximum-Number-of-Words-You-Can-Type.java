class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        Set<Character> broken = new HashSet<>();
        int count = 0;
        for(char c : brokenLetters.toCharArray()){
            broken.add(c);
        }
        for(String word : words){
            boolean cantype = true;
            for(char c : word.toCharArray()){
                if(broken.contains(c)){
                cantype = false;
                break;
            }
        
         }
            
            if(cantype) count++;
        }
        
        return count;
    }
}