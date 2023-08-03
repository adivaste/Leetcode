class Solution {

    public void swap(int[][] arr, int firsti, int firstj, int secondi, int secondj) {
        int temp = arr[firsti][firstj];
        arr[firsti][firstj] = arr[secondi][secondj];
        arr[secondi][secondj] = temp;
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swap(matrix, i, j, i, n - 1 - j);
            }
        }
    }
}
