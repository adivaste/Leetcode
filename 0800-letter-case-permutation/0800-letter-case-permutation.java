class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        findLetterCaseCombination(sb, answer, 0);
        return answer;
    }

    public void findLetterCaseCombination(StringBuilder sb, List<String> answer, int curr){
        if (curr == sb.length()){
            answer.add(sb.toString());
            return;
        }

        char ch = sb.charAt(curr);
        if ((ch >= 'a' &&ch <= 'z') || (ch >= 'A' &&ch <= 'Z') ){
            int ccval = (int)ch ^ (1 << 5);
            sb.setCharAt(curr, (char) ccval);
            findLetterCaseCombination(sb, answer, curr+1);

            ccval = (int)sb.charAt(curr) ^ (1 << 5);
            sb.setCharAt(curr, (char) ccval);
            findLetterCaseCombination(sb, answer, curr+1);
        }
        else{
            findLetterCaseCombination(sb, answer, curr+1);
        }
    }
}