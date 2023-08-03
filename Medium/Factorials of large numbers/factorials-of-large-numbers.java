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
    
    public static void multiply(ArrayList<Integer> answer, int multiplier){
        
        int carry  = 0;
        
        for(int i=0; i<answer.size(); i++){
            
            int result = answer.get(i)*multiplier;
            result = result + carry;
            
            int sum = result%10;
            answer.set(i,sum);
            
            carry = result/10;
        }
        
        while(carry != 0){
            int lastDigit = carry%10;
            carry = carry/10;
            answer.add(lastDigit);
        }
    }
    
    static ArrayList<Integer> factorial(int N){
        
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        
        for(int multiplier=2; multiplier<=N; multiplier++){
            multiply(answer, multiplier);
        }
        
        Collections.reverse(answer);
        return answer;
    }
}