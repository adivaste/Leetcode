import java.util.ArrayList;

class Solution {

    public ArrayList<Integer> getLeftMax(int[] height){
        ArrayList<Integer> temp = new ArrayList<>();
        int max = height[0];

        for(int i=0; i<height.length; i++){
            max = Math.max(height[i], max);
            temp.add(max);
        }

        return temp;
    }

    public ArrayList<Integer> getRightMax(int[] height){
        ArrayList<Integer> temp = new ArrayList<>();
        int max = height[height.length-1];
        
        // Add the initial max value to the list
        temp.add(max);

        // Traverse from right to left and update the maximum height encountered
        for(int i=height.length-2; i>=0; i--){
            max = Math.max(height[i], max);
            temp.add(0, max); // Insert the new max value at the beginning of the list
        }

        return temp;
    }

    public int trap(int[] height) {
        int size = height.length;

        ArrayList<Integer> leftMax = getLeftMax(height);
        ArrayList<Integer> rightMax = getRightMax(height);

        int sum = 0;
        for(int i=0; i<size; i++){
            int h = Math.min(leftMax.get(i), rightMax.get(i)) - height[i];
            sum += h;
        }

        return sum;
    }
}
