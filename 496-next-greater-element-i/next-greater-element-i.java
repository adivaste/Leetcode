// import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            map.put(nums2[i], s.isEmpty() ? -1 : s.peek());
            s.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        int i = 0;
        for (int num : nums1) {
            ans[i] = map.get(num);
            i++;
        }

        return ans;
    }
}
