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
            int k = Integer.parseInt(a1[1]);
            String b = br.readLine().trim();
            String[] b1 = b.split(" "); 
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(b1[i]);
            Solution ob = new Solution();
            int ans = ob.KthDistinct(nums,k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int KthDistinct(int[] arr, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        ArrayList<Integer> distinctElements = new ArrayList<>();
        
        // Count the frequency of each element in the array
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        // Iterate through the array and add distinct elements to the list
        for (int num : arr) {
            if (frequency.get(num) == 1) {
                distinctElements.add(num);
            }
        }
        
        // If k is valid, return the kth distinct element; otherwise, return -1
        if (k > 0 && k <= distinctElements.size()) {
            return distinctElements.get(k - 1);
        } else {
            return -1; // Invalid k
        }
    }

}