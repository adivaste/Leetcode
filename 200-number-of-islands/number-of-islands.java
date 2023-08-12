class Solution {

    public void makeIsland(char[][] grid, int row, int column, int rowSize, int columnSize){

        if (grid[row][column] == '1'){
            grid[row][column] = '#';

            if (row < rowSize-1) makeIsland(grid, row+1, column, rowSize, columnSize);
            if (row > 0) makeIsland(grid, row-1, column, rowSize, columnSize);

            if (column < columnSize-1) makeIsland(grid, row, column+1, rowSize, columnSize);
            if (column > 0) makeIsland(grid, row, column-1, rowSize, columnSize);
        }
        return;
    }

    public int numIslands(char[][] grid) {
        
        // Count of islands
        int count = 0;
        int rowSize = grid.length;
        int columnSize = grid[0].length;

        for(int row=0; row<rowSize; row++){
            for(int column=0; column<columnSize; column++){
                if (grid[row][column] == '1'){
                    makeIsland(grid, row, column, rowSize, columnSize);
                    count++;
                }
            }
        }
        return count;
    }
}