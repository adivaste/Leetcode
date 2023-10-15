class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        findAllParenthesis(n,n,answer, new StringBuilder());
        return answer;
    }

    public void findAllParenthesis(int open, int close, List<String> answer, StringBuilder paren){
        if (open == 0 && close == 0){
            answer.add(paren.toString());
            return;
        }

        if (open == close){
            paren.append("(");
            findAllParenthesis(open-1,close ,answer, paren);
            paren.deleteCharAt(paren.length()-1);
        }
        else if (open < close){
           
           if(open > 0){
               paren.append("(");
               findAllParenthesis(open-1,close ,answer, paren);
               paren.deleteCharAt(paren.length()-1);
           }

           paren.append(")");
           findAllParenthesis(open,close-1,answer, paren);
           paren.deleteCharAt(paren.length()-1);
        }
    }
}