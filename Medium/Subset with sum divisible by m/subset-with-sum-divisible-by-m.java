//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String a = br.readLine().trim();
            String[] a1 = a.split(" ");
            int n = Integer.parseInt(a1[0]);
            int m = Integer.parseInt(a1[1]);
            String b = br.readLine().trim();
            String[] b1 = b.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < b1.length; i++)
                nums[i] = Integer.parseInt(b1[i]);
            Solution ob = new Solution();
            int ans = ob.DivisibleByM(nums, m);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends



class Solution
{
    public boolean call(int[] nums,int sum,int i,int m)
    {
        if(sum%m==0&&i>0)
        {
            return true;
        }
       
        boolean ans=false;
        for(int p=i;p<nums.length;p++)
        {
            ans=ans||call(nums,(sum+nums[p]),p+1,m);
        }
        return ans;
    }
    public int DivisibleByM(int [] nums, int m)
    {
       // boolean
        for(int q=0;q<nums.length;q++)
        {
    if(nums[q]==m)
    {
        return 1;
    }
           // nums[q]=nums[q]%m;
        }
        if(call(nums,0,0,m))
        {
            return 1;
        }
        return 0;
    }
}