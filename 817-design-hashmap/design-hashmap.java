class MyHashMap {


    private int size;
    private LinkedList<Pair<Integer, Integer>>[] hashmap;

    public MyHashMap() {
        this.size = 100000 + 1;
        this.hashmap = new LinkedList[this.size];

        for (int i = 0; i < this.size; i++) {
            this.hashmap[i] = new LinkedList<>();
        }
    }

    public int getIndex(int key) {
        return key % this.size;
    }

    public int getInnerIndex(int key) {
        int index = getIndex(key);
        for (int i = 0; i < hashmap[index].size(); i++) {
            if (hashmap[index].get(i).getKey().equals(key)) return i;
        }
        return -1;
    }

    public void put(int key, int value) {
        Pair<Integer, Integer> temp = new Pair(key, value);
        int index = getIndex(key);
        int innerIndex = getInnerIndex(key);

        if (innerIndex != -1) {
            this.hashmap[index].set(innerIndex, temp); // Update the existing key-value pair
        } else {
            this.hashmap[index].add(temp); // Add a new key-value pair
        }
    }

    public int get(int key) {
        int index = getIndex(key);
        int innerIndex = getInnerIndex(key);

        if (innerIndex != -1) {
            return this.hashmap[index].get(innerIndex).getValue(); // Return the value if key exists
        }

        return -1; // Key not found, return -1
    }

    public void remove(int key) {
        int index = getIndex(key);
        int innerIndex = getInnerIndex(key);

        if (innerIndex != -1) {
            this.hashmap[index].remove(innerIndex); // Remove the key-value pair if key exists
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */