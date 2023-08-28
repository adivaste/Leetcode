class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int targetSize = target.length;
        int arrSize = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<targetSize; i++){
            map.put(target[i], map.getOrDefault(target[i], 0) + 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
        }

        for(int key : map.keySet()){
            if (map.get(key) != 0) return false;
        }

        return true;
    }
}

