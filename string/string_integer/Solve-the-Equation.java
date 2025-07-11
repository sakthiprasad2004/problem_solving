class Solution{
    public String solveEquation(String equation){
           String[] parts = equation.split("=");
           int[] leftparts = evaluate(parts[0]);
           int[] rightparts = evaluate(parts[1]);
           if(leftparts[0]==rightparts[0] && leftparts[1]==rightparts[1]  ){
            return "Infinite solutions";
           }
           else if(leftparts[0]==rightparts[0]) return "No solution";
           return "x=" + (rightparts[1]-leftparts[1]) / (leftparts[0] - rightparts[0]);

    }
    private int[] evaluate(String str){
        String[] tokens = str.split("(?=[+-])");
        int[] res = new int[2];
        for(String token : tokens){
            if(token.equals("+x")|| token.equals("x")){
                res[0]++;
            }
            else if(token.equals("-x")|| token.equals("x")){
                res[0]--;
            }
            else if(token.contains("x")){
                res[0] += Integer.parseInt(token.substring(0,token.length()-1));
            }
            else res[1] += Integer.parseInt(token);
        }
        return res;
    }
}
    

        
        