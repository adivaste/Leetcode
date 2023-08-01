class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Use -99 as the marker for rows and columns to be zeroed
        int marker = -99;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    // Mark rows and columns to be zeroed using the marker
                    for (int x = 0; x < rows; x++) {
                        if (matrix[x][j] != 0) {
                            matrix[x][j] = marker;
                        }
                    }
                    for (int y = 0; y < columns; y++) {
                        if (matrix[i][y] != 0) {
                            matrix[i][y] = marker;
                        }
                    }
                }
            }
        }

        // Convert the marked elements to zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == marker) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
