//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        char[] chars = S.toCharArray();
        reverse(chars, 0, S.length()-1);
        
        int start = 0;
        for(int end=start; end<=S.length(); end++){
            if (end == S.length() || chars[end] == '.') {
                reverse(chars,start, end-1);
                start = end+1;
            }
        }
        
        S = new String(chars);
        return S;
    }
    
    void reverse(char[] arr, int start, int end){
        
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}