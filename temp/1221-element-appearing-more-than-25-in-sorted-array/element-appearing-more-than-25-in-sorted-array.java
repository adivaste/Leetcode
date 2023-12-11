class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int tf = arr.length/4;

        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) > tf) return arr[i];
        }

        return -1;
    }
}