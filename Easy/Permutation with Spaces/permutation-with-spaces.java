//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb  = new StringBuilder(S);
        
        findPermutations(S, sb, answer, 1);
        return answer;
    }
    
    public static void findPermutations(String S, StringBuilder sb, ArrayList<String> answer, int curr){
        if (curr >= sb.length()){
            answer.add(sb.toString());
            return;
        }
        
        sb.insert(curr," ");
        findPermutations(S, sb, answer, curr+2);
        
        sb.deleteCharAt(curr);
        findPermutations(S, sb, answer, curr+1);
    }
    
}