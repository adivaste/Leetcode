class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();

        for(int i=1; i<=n; i++){
            friends.add(i);
        }

        int index = 0;

        while(friends.size() != 1){
            int size = friends.size();
            index = (index + k - 1)%size;   
            friends.remove(index);
        }

        return friends.get(0);
    }
}