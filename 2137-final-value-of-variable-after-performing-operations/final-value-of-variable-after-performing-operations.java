class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer = 0;
        for(String operation : operations){
            if (operation.equals("++X")) answer += 1;
            else if (operation.equals("X++")) answer += 1;
            else if (operation.equals("--X")) answer -= 1;
            else answer -= 1;
        }

        return answer;
    }
}