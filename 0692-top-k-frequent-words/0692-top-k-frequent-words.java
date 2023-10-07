class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> map = new HashMap<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        };

        PriorityQueue<String> queue = new PriorityQueue<>((a,b) -> {
            int freA = map.get(a);
            int freB = map.get(b);

            if (freA != freB){
                return freB - freA;
            }
            else{
                return a.compareTo(b);
            }
        });


        for(String entry : map.keySet()){
            queue.add(entry);
        }

        List<String> answer = new ArrayList<String>();
        while(!queue.isEmpty() && k != 0){
            answer.add(queue.poll());
            k--;
        }

        return answer;
    }
}