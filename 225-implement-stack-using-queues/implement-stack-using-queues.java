class MyStack {

    Queue<Integer> q1 ;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public  void push(int data){
            q1.offer(data);
            for(int i=0; i<q1.size()-1; i++){
                q1.offer(q1.poll());
            }
        }
        
        // Pop
        public int pop(){
            if (empty()) return -1;
            return q1.poll();
        }
        // Peek
        public int top(){
            if(empty()) return -1;
            return q1.peek();
        }
        // isEmpty
        public boolean empty(){
            return (q1.size() == 0);
        }
        
        // getSize
        // public int getSize(){
        //     return q1.size();
        // }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */