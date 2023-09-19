class MyHashMap {


    private int size;
    private int[] hashmap;

    public MyHashMap() {
        this.size = 1000000 + 1;
        this.hashmap = new int[this.size];
        for(int i=0; i<this.size; i++){
            this.hashmap[i] = -1;
        }
    }   
    
    public void put(int key, int value) {
        this.hashmap[key] = value;
    }
    
    public int get(int key) {
        return this.hashmap[key];
    }
    
    public void remove(int key) {
        this.hashmap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */