class Solution {
    public int findKthPositive(int[] arr, int k) {

        Set<Integer> set = new HashSet<Integer>();
        for(Integer ele : arr){
            set.add(ele);
        }

        int curr = 1;
        int missingPositive = -1;
        while(k != 0){
            if(!set.contains(curr)){
                missingPositive = curr;
                k--;
            }
            curr++;
        }
        return missingPositive;
    }
}