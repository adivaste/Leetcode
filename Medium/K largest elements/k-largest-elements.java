//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> list = ob.kLargest(arr, n, k);
            for(int i = 0; i<list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
            t--;
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // Answer as output
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        // Use Priority Queue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        
        // Traverse and insert element
        for(int item : arr){
            queue.add(item);
            if (queue.size() > k){
                queue.poll();
            }
        }
        
        while(!queue.isEmpty()){
            answer.add(0,queue.poll());
        }
        
        return answer;
        
    }
}