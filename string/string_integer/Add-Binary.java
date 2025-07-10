class Solution {
    public String addBinary(String a, String b) {     
       int i = a.length()-1;
       int j=b.length()-1;
       StringBuilder res = new StringBuilder();
       int carry = 0;
       while(i >=0 || j >= 0 || carry != 0 ){
            int digitA = 0;
            if(i >= 0){
                  digitA = a.charAt(i--) - '0';
            }
            int digitB = 0;
             if(j >= 0){
                  digitB = b.charAt(j--) - '0';
            }
           
        
            int total = digitA + digitB+carry;
            res.append(total%2);
            carry = total / 2;

       } 
       return res.reverse().toString();       
    }
}