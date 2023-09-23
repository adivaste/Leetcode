//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        Boolean[][] dp = new Boolean[arr.length+1][sum+1];
        for(int i=0; i<arr.length+1; i++){
            for(int j=0; j<sum+1; j++){
                dp[i][j] = null;
            }
        }
        return findSubsetSum(arr, sum, N, dp);
    }
    
    public static boolean findSubsetSum(int[] arr, int sum, int n, Boolean[][] dp){
        
        // Base condition
        if ( sum == 0) return true;
        if ( n == 0) return false;

        // Search in dp
        if (dp[n-1][sum] != null) return dp[n-1][sum];

        // Check as per choise diagram
        if ( arr[n-1] <= sum){
            dp[n-1][sum] = findSubsetSum(arr, sum-arr[n-1], n-1, dp);
            if (dp[n-1][sum]) return true;
            dp[n-1][sum] = findSubsetSum(arr, sum, n-1, dp);
            return dp[n-1][sum];
        }
        else{
            dp[n-1][sum] = findSubsetSum(arr, sum, n-1, dp);
            return dp[n-1][sum];
        }
    }
}