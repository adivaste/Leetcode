class Solution {
    public boolean exist(char[][] board, String word) {
        int rowSize = board.length;
        int colSize = board[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (check(board, word, 0, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean check(char[][] board, String word, int currIdx, int row, int col) {
        if (currIdx == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(currIdx)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = check(board, word, currIdx + 1, row + 1, col)
                || check(board, word, currIdx + 1, row - 1, col)
                || check(board, word, currIdx + 1, row, col + 1)
                || check(board, word, currIdx + 1, row, col - 1);

        board[row][col] = temp; // Restore the original character
        return found;
    }
}
