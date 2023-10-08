//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        ot.print(res[i] + " ");
		    ot.println();
		}
        ot.close();
	}
}



// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Long> stack = new Stack<>();
        int size = arr.length;
        long[] result = new long[n];
        int idx = size-1;
        
        // Traverse the array
        for(int i=size-1; i>=0; i--){
            
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if (stack.isEmpty()) result[idx--] = -1L;
            else result[idx--] = stack.peek();
            
            stack.push(arr[i]);
        }
        return result;
    } 
}