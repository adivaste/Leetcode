class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder answer = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            int remainder = columnNumber%26;
            char ch = (char)((int)'A' + remainder);
            answer.append(ch);
            columnNumber /= 26;
        }
        return new String(answer.reverse());
    }
}