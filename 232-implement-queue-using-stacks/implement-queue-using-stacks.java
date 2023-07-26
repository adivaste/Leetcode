class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
        
    }        
        // Push
        public void push(int data){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.empty()){
                s1.push(s2.pop());
            }
        }
        
        // Pop
        public int pop(){
            if (empty()) return -1;
            return s1.pop();
        }
        // Peek
        public int peek(){
            if(empty()) return -1;
            return s1.peek();
        }
        // isEmpty
        public boolean empty(){
            return (s1.size() == 0);
        }
        
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */