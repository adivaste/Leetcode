class OrderedStream {

    private String[] map;
    private int pointer;

    public OrderedStream(int n) {
        this.map = new String[n+1];
        this.pointer = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        map[idKey] = value;

        List<String> answer = new ArrayList<String>();

        while(this.pointer < this.map.length && map[this.pointer] != null){
            String mapVal = map[this.pointer];
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