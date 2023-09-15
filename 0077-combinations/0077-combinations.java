class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        findCombinations(n, answer, new ArrayList<Integer>(), 1, k);
        return answer;
    }

    private void findCombinations(int n, List<List<Integer>> answer, ArrayList<Integer> output,int curr,int k){
        if (output.size() == k){
            answer.add(new ArrayList<>(output));
            return;
        }
        if (curr > n){
            return;
        }

        // Insert 
        output.add(curr);
        findCombinations(n, answer, output, curr+1, k);
        output.remove(output.size()-1);
        findCombinations(n, answer, output, curr+1, k);
    }


}