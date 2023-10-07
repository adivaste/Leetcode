class Solution {

    class Pair{
        int value;
        int difference;

        public Pair(int val, int difference){
            this.value = val;
            this.difference =  difference;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> {
            int diffA = Math.abs(a - x);
            int diffB = Math.abs(b - x);
            if (diffA != diffB) {
                return Integer.compare(diffB, diffA);
            }
            return Integer.compare(b, a);
        });

        for (int num : arr) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>(maxHeap);
        Collections.sort(result);
        return result;
    }



}
