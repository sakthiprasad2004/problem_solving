class Solution {
    public String decodeString(String s) {
         Stack<String> stack = new Stack<>();
         for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(String.valueOf(ch));
            }
            else{
                StringBuilder decodestring = new StringBuilder();
                while(!stack.peek().equals("[")){
                    decodestring.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder no = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    no.insert(0,stack.pop());
                }
                int repeatcount = Integer.parseInt(no.toString());
                String repeated = decodestring.toString().repeat(repeatcount);
                stack.push(repeated);

            }
         }
         StringBuilder res = new StringBuilder();
         for(String str : stack){
            res.append(str);
         }
         return res.toString();
    }
}