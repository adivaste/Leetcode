class Solution {
    public int[][] transpose(int[][] matrix) {

        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int[][] newMatrix = new int[colSize][rowSize];

        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                newMatrix[j][i] = matrix[i][j];
            }
        }

        return newMatrix;
    }
}