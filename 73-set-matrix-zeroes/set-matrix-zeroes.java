class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Create a new array to store the result
        int[][] answer = new int[rows][columns];

        // Copy the original matrix to the answer array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                answer[i][j] = matrix[i][j];
            }
        }

        // Iterate through the matrix to find zeros and update the answer array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    for (int x = 0; x < rows; x++) {
                        answer[x][j] = 0;
                    }
                    for (int y = 0; y < columns; y++) {
                        answer[i][y] = 0;
                    }
                }
            }
        }

        // Copy the result back to the original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = answer[i][j];
            }
        }
    }
}
