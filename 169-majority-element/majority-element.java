
class Solution {
    public int majorityElement(int[] nums) {

        // A2 - HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int max = 0;
        int answer = -1;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                answer = key;
                break; // No need to continue once we find the majority element
            }
        }

        return answer;
    }
}
