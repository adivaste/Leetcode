class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat == null || r == 0 || c == 0 ) return mat;
        int rowSize = mat.length;
        int colSize = mat[0].length;
        if (r == rowSize && c == colSize || rowSize*colSize != r*c) return mat;


        int[] collective = new int[rowSize*colSize];
        int pointer = 0;
        int[][] answer = new int[r][c];

        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                collective[pointer++] = mat[i][j];
            }
        }

        pointer = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                answer[i][j] = collective[pointer++];
            }
        }

        return answer;

    }
}