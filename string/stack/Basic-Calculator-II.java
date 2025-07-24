class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char ch = '+';
        for(int i=0;i<s.length();i++){
            char char_s = s.charAt(i);
            if(Character.isDigit(char_s)){
                num = num * 10 + (char_s - '0');
            }
            if((!Character.isDigit(char_s) && char_s != ' ') || i==s.length()-1){
                if(ch == '+'){
                    stack.push(num);
                }
                else if(ch == '-'){
                    stack.push(-num);
                }
                else if(ch == '*'){
                    stack.push(stack.pop()*num);
                }
                else if(ch == '/'){
                    
                    stack.push(stack.pop() / num);
                } 
                 num = 0;
            ch = char_s;   
                     
            }         
           
    
    }
    int res = 0;
    for(int num1 : stack){
        res += num1;
    }
    return res;
}
}