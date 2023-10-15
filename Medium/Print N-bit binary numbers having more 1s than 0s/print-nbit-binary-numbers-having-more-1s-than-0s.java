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
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> answer = new ArrayList<>();
        findNBitBinary(0, 0, answer, "", N);
        return answer;
    }
    
    public void findNBitBinary(int count0, int count1, 
        ArrayList<String> answer, String number, int N){
        
        if (number.length() == N){
            answer.add(number);
            return;
        }
        
        findNBitBinary(count0, count1+1, answer, number + "1", N);
        if( count0+1 <= count1){
            findNBitBinary(count0 + 1, count1, answer, number + "0", N);
        }
    }
}