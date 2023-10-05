class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int size = nums.length;

        for(int i=0; i<size; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int freq = size/3;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int key : map.keySet()){
            if (map.get(key) > freq) answer.add(key);
        }

        return answer;
    }
}