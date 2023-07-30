
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

        int halfSize = size / 2;
        for (int key : map.keySet()) {
            if (map.get(key) > halfSize) {
                return key;
            }
        }

        return -1;
    }
}
