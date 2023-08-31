class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 == 1) return false;
        
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(char ch : s.toCharArray()){
            
            // If opening bracket is there
            if (ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }
            else {
                // Closing Bracket
                if (!stack.isEmpty()){
                    char top = stack.pop();
                    if (map.get(ch) != top) return false;
                }
                else{
                    return false;
                }
            }
        }
        
        if (stack.isEmpty()) return true;
        return false;
    }
}