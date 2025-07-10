class Solution {
    public String addStrings(String num1, String num2) {
        int a = num1.length()-1;
        int b = num2.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(a >= 0 || b >= 0 || carry != 0){
            int digitA = 0,digitB=0;
            if(a >= 0) {
                digitA = num1.charAt(a--)-'0';
            }
            if(b >= 0) digitB = num2.charAt(b--)-'0';
            int total = digitA + digitB + carry;
            carry = total / 10;
            res.append(total % 10);
        }
        return res.reverse().toString();
    }
}