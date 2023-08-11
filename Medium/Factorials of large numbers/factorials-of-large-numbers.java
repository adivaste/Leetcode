//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static void multiply(ArrayList<Integer> arr, int multiplier){
        int carry = 0;
        
        for(int i=arr.size()-1; i>=0; i--){
            int result = arr.get(i)*multiplier + carry;
            int sum = result%10;
            carry = result/10;
            
            arr.set(i, sum);
        }
        
        while(carry != 0){
            int lastDigit = carry%10;
            arr.add(0, lastDigit);
            carry = carry/10;
        }
        
        /*
        1    
        2  -- x2   -- carry:0, result:2, sum:2, carry:0
        6  -- x3   -- carry:0, result:6, sum:6, carry:0
        24  -- x4   -- carry:0, result:24, sum:4, carry:2
        120  -- x5   -- carry:0, result:20, sum:0, carry:2
                    -- carry:2, result:12, sum:2; carry:1;
        
        
        */
    }
    
    static ArrayList<Integer> factorial(int N){
        
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        
        if (N <= 1) return answer;
        
        for(int i=2; i<=N; i++){
            multiply(answer, i);
        }
        
        return answer;
    }
}