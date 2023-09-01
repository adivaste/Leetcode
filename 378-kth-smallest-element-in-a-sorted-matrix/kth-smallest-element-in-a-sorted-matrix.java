class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        int rowSize = matrix.length;
        int columnSize = matrix[0].length;
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize; j++){
                pq.offer(matrix[i][j]);
                if( pq.size() > k){
                    pq.poll();
                }
            }
        }

        return pq.peek();
    }
}