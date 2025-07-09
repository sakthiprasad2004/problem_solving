class Solution {
    public int myAtoi(String s) {
      int n = s.length();
      int i=0;
      final int maxi = Integer.MAX_VALUE;
      final int mini = Integer.MIN_VALUE;
      //trimming
      while(i < n && s.charAt(i)==' ') i++;
      if(i==n) return 0;
      //sign
      int sign = 1;
      if(s.charAt(i)== '+' ) i++;
      else if(s.charAt(i)=='-') {
        sign = -1;
        i++;
      }
      long res = 0;
      while(i < n && Character.isDigit(s.charAt(i))){
        int digit = s.charAt(i) - '0';
        res = res*10+digit;
        if(sign==-1 && res >(long)maxi+1) return mini;
         if(sign==1 && res > maxi) return maxi;
        i++;
      }
      return (int)(res*sign);


    }
    
}