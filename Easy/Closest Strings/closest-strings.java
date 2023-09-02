//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> wordList, String word1, String word2) {
        int minDistance = Integer.MAX_VALUE;
        Integer index1 = null;
        Integer index2 = null;

        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(word1)) {
                index1 = i;
            }
            if (wordList.get(i).equals(word2)) {
                index2 = i;
            }

            if (index1 != null && index2 != null) {
                int distance = Math.abs(index1 - index2);
                minDistance = Math.min(minDistance, distance);
            }
        }

        return minDistance;
    }
};