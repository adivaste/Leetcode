class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int rows = matrix.length;
        int columns = matrix[0].length;

        ArrayList<Integer> answer = new ArrayList<>();
        int dir = 0;
        int top = 0;
        int bottom = rows-1;
        int left = 0;
        int right = columns-1;

        while(top <= bottom && left <= right){
            
            if (dir == 0){
                // left to right
                // constant : row(top)

                for(int i=left; i<=right; i++){
                    answer.add(matrix[top][i]);
                }
                top++;
            }

            if (dir == 1){
                // top to bottom
                // constant : column(right)

                for(int i=top; i<=bottom; i++){
                    answer.add(matrix[i][right]);
                }
                right--;
            }

            if (dir == 2){
                // right to left
                // constant = row(bottom)

                for(int i=right; i>=left; i--){
                    answer.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(dir == 3){
                // bottom to top
                // constant = column(left)

                for(int i=bottom; i>=top; i--){
                    answer.add(matrix[i][left]);
                }
                left++;
            }
            dir++;

            if (dir == 4){
                dir = 0;
            }

        }

        return answer;
    }
}