class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            queue.add(e);
            if (queue.size() > k){
                queue.poll();
            }
        }
        
        int[] answer = new int[k];
        int idx = 0;
        while(!queue.isEmpty()){
            answer[idx] = queue.poll().getKey();
            idx++;
        }

        return answer;
    }
}