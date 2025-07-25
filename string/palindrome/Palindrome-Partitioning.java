class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> part = new ArrayList<>();
        dfs(0,s,part,res);
        return res;
    }

    private void dfs(int i,String s,List<String> part ,List<List<String>> res){
        if(i >= s.length())
        {
            res.add(new ArrayList<>(part));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(ispalindrome(s,i,j)){
                part.add(s.substring(i,j+1));
                dfs(j+1,s,part,res);
                part.remove(part.size()-1);
            }
        }
    }

    private boolean  ispalindrome(String s , int l , int r){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}