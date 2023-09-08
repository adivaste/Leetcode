class Solution {
    public List<List<Integer>> generate(int numRows) {

        // Answer
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        answer.add(first);

        /// Base case
        if (numRows == 1) return answer;

        // For other numbers
        for(int j=2; j<=numRows; j++){
            List<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int i=1; i<j-1; i++){
                List<Integer> prev = answer.get(answer.size()-1);
                curr.add(prev.get(i-1) + prev.get(i));
            }
            curr.add(1);
            answer.add(curr);
        }
        return answer;
    }
}