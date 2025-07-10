class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")|| num2.equals("0")) return "0";
        int[] res = new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int mul = digit1*digit2;
                int p1 = i+j;
                int p2 = i+j+1;
                int sum = mul + res[p2];
                res[p2] = sum%10;
                res[p1] += sum/10;

            }
            
        }
         // avoid leading zeros
            StringBuilder sb = new StringBuilder();
            for(int r : res){
                if(!(sb.length()==0 && r==0)){
                    sb.append(r);
                }
            }
            return sb.toString();


    }
}