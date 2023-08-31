//{ Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends



class Solution
{
    public int[][] overlappedInterval(int[][] intervals)
    {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        boolean[] checked = new boolean[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            if (!checked[i]) {
                int[] local = new int[]{intervals[i][0], intervals[i][1]};
                checked[i] = true;

                int curr = i;
                int next = i + 1;

                while (next < intervals.length && local[1] >= intervals[next][0]) {
                    local[1] = Math.max(local[1], intervals[next][1]);
                    checked[next] = true;
                
                    curr = next;
                    next = next + 1;
                }

                merged.add(local);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}



/*
// Question: Merge overlapping intervals

// Assuming you have a list of intervals as an array of pairs [start, end]
// intervals should be sorted based on the start value

// Sort intervals based on the start value
sort(intervals)

// Initialize an empty list to store the merged intervals
List<int[]> answer = []

// Initialize a boolean array to keep track of intervals that have been checked
Boolean[] checked = new Boolean[intervals.length]

// Loop through each interval
for (int i = 0; i < intervals.length; i++) {
    int[] local = [intervals[i][0], intervals[i][1]]
    checked[i] = true

    int curr = i
    int next = i + 1

    // Merge overlapping intervals
    while (next < intervals.length && intervals[curr][1] >= intervals[next][0]) {
        local[1] = max(local[1], intervals[next][1])
        checked[next] = true

        curr = next
        next = next + 1
    }

    answer.add(local)
}

// Print or return the merged intervals in the 'answer' list
*/