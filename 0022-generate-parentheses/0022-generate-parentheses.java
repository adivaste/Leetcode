class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        findAllParenthesis(n,n,answer, "");
        return answer;
    }

    public void findAllParenthesis(int open, int close, List<String> answer, String paren){
        if (open == 0 && close == 0){
            answer.add(paren);
            return;
        }
        if (open == close){
            findAllParenthesis(open-1,close ,answer, paren + "(");
        }
        else if (open < close){
           if(open > 0){
               findAllParenthesis(open-1,close ,answer, paren + "(");
           }
           findAllParenthesis(open,close-1,answer, paren + ")");
        }
    }
}