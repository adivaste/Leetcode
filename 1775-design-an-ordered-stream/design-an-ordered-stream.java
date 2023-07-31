class OrderedStream {

    private HashMap<Integer, String> map;
    private int pointer;

    public OrderedStream(int n) {
        this.map = new HashMap<>();
        this.pointer = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        map.put(idKey, value);

        List<String> answer = new ArrayList<String>();

        while(this.pointer <= this.map.size() && map.get(this.pointer) != null){
            String mapVal = map.get(this.pointer);
            answer.add(mapVal);
            this.pointer++;
        }
        return answer;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */