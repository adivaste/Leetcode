//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Stack to store the greater elements
        Stack<Long> stack = new Stack<>();
        ArrayList<Long> answer = new ArrayList<>();
        int size = arr.length;
        
        // Traverse the array
        for(int i=size-1; i>=0; i--){
            
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if (stack.isEmpty()) answer.add(-1L);
            else answer.add(stack.peek());
            
            stack.push(arr[i]);
        }
        
        long[] result = new long[n];
        int idx = size-1;
        for(Long num : answer){
            result[idx] = num;
            idx--;
        }
        return result;
    } 
}