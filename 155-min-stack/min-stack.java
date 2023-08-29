class MinStack {

    private Stack<Integer> s;
    private Stack<Integer> ss;

    public MinStack() {
        s = new Stack<>();    
        ss = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if (ss.size() == 0 || val <= ss.peek()){
            ss.push(val);
        }
    }
    
    public void pop() {
        if (s.size() > 0){
            int top = s.pop();

            if (top == ss.peek()){
                ss.pop();
            }
        }
    }
    
    public int top() {  
        if (s.size() > 0) return s.peek();
        return -1;
    }
    
    public int getMin() {
        if (ss.size() > 0) return ss.peek();
        return -1;
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