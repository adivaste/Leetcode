class Solution {
    public int evalRPN(String[] tokens) {
        // String[] tokens = {"4","13","5","/","+"};
        return conversion(tokens);
    }

    public int evaluate(int val1, int val2, String opr){
        if (opr.equals("+")) return val1 + val2;
        else if (opr.equals("-")) return val1 - val2;
        else if (opr.equals("*")) return val1 * val2;
        else return val1 / val2;
    }

    public int conversion(String[] expression){
        Stack<Integer> valueStack = new Stack<>();

        for(int i=0; i<expression.length; i++){

            // Get each character
            String c = expression[i];

            if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*")){
                int val2 = valueStack.pop();
                int val1 = valueStack.pop();
                int ans = evaluate(val1, val2, c);
                valueStack.push(ans);
            }
            else{
                valueStack.push(Integer.parseInt(c));
            }
        }
        return valueStack.pop();
    }
}