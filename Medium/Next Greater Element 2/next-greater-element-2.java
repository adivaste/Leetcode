//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans[] = obj.nextGreaterElement(n, a);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] nextGreaterElement(int N, int arr[]) {
        
        Stack<Integer> stack = new Stack<>();
        int size = arr.length;
        int[] result = new int[N];
        int idx = size-1;
        
        // Traverse the array
        for(int i=size-1; i>=0; i--){
            
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if (stack.isEmpty()) result[idx--] = -1;
            else result[idx--] = stack.peek();
            
            stack.push(arr[i]);
        }
        
        
        idx = size-1;
        for(int i=size-1; i>=0; i--){
            if (result[i] != -1) {
                idx--;
                continue;
            }
            
            while (!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if (stack.isEmpty()) result[idx--] = -1;
            else result[idx--] = stack.peek();
            
            stack.push(arr[i]);
        }
        
        
        return result;
    }
}
