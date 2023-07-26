class MinStack {

    class Pair{
        int x, y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    private Stack<Pair> s;

    public MinStack() {
        s = new Stack<Pair>();
    }
    
    public void push(int val) {
        int min;
        if(s.isEmpty()){
            min = val;
        }
        else{
            min = Math.min(s.peek().y, val);
        }
        s.push(new Pair(val, min));
    }
    
    public void pop() {
        if (s.isEmpty()) return;
        s.pop();
    }
    
    public int top() {
        if (s.isEmpty()) return -1;
        return s.peek().x;
    }
    
    public int getMin() {
        if (s.isEmpty()) return -1;
        return s.peek().y;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */