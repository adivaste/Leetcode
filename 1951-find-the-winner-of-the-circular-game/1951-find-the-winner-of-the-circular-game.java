class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            friends.add(i);
        }

        int removalIndex = 0;
        while(friends.size() > 1){
            int size = friends.size();
            removalIndex = (removalIndex + k - 1)%size;
            friends.remove(removalIndex);
        }

        return friends.get(0);
    }
}