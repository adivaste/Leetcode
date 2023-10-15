class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        color(image, sr, sc, oldColor, color);
        return image;
    }

    public void color(int[][] image, int sr, int sc, int oldColor, int newColor){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor || image[sr][sc] == newColor){
            return;
        }

        image[sr][sc] = newColor;
        color(image, sr+1, sc, oldColor, newColor);
        color(image, sr-1, sc, oldColor, newColor);
        color(image, sr, sc+1, oldColor, newColor);
        color(image, sr, sc-1, oldColor, newColor);
    }
}