class Solution {
    public boolean isValid(String expression) {
        Stack<Character> s = new Stack<>();
        HashMap<Character, Character> h = new HashMap<>();
        h.put(')', '(');
        h.put(']', '[');
        h.put('}', '{');

        for(int i=0; i<expression.length(); i++){

            // Get character
            char c = expression.charAt(i);

            // If it is opening bracket then push to stack
            if (h.containsValue(c)){
                s.push(c);
            }
            
            // If it is closing bracket, get its opening pair
            // from map, and match with stack top
            // Matched :: pop()
            // No matched :: false | not balanced expression 
            else if (h.containsKey(c) && s.size() != 0){
                if (h.get(c) == s.peek()){
                    s.pop();
                }
                else{
                    return false;
                }
            }
            // Stack is empty, still bracket in expression, means thats
            // extra part
            else if (h.containsKey(c) && s.size() == 0){
                return false;
            }
        }

        // Expression ended stil stack has something then return false
        // otherwise true
        if (s.empty()){
            return true;
        }
        return false;
    }
}