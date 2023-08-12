class Solution {

    public void makeIsland(char[][] grid, int row, int column, int rowSize, int columnSize){

        if (row < rowSize && row >= 0 && column < columnSize && column >= 0 && grid[row][column] == '1'){
            grid[row][column] = '#';
            
            makeIsland(grid, row+1, column, rowSize, columnSize);
            makeIsland(grid, row-1, column, rowSize, columnSize);
            makeIsland(grid, row, column+1, rowSize, columnSize);
            makeIsland(grid, row, column-1, rowSize, columnSize);
        }
        else{
            return;
        }
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