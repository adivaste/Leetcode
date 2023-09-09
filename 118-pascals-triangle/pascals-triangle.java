class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> answer = new ArrayList<List<Integer>>();

        for(int i=0; i<numRows; i++){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            for (int count = 0; count <= i; count++) {
                curr.add(1);
            }

            
            for(int j=1; j<i; j++){
                int val = answer.get(i-1).get(j) + answer.get(i-1).get(j-1);
                curr.set(j, val);
            }

            answer.add(curr);
        }

        return answer;

    }
}