class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int increment = 2*(numRows-1);
        StringBuilder res = new StringBuilder();
        for(int r=0;r<numRows;r++){
            for(int i=r;i<s.length();i+=increment){
                res.append(s.charAt(i));

                int mid = i+increment - 2*r;
                if(r > 0 && r < numRows - 1 && mid < s.length()){
                    res.append(s.charAt(mid));
                }
            }

        }
        return res.toString();
    }
}