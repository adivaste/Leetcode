class BrowserHistory {

    Stack<String> backward;
    Stack<String> forward;

    public BrowserHistory(String homepage) {
        backward = new Stack<>();
        forward = new Stack<>();

        backward.push(homepage);
    }
    
    public void visit(String url) {
        // Clear forward
        while(!forward.isEmpty()) forward.pop();
        backward.push(url);
    }
    
    public String back(int steps) {
        // Pop from backword into forward
        while(backward.size() != 1 && steps != 0){
            forward.push(backward.pop());
            steps--;
        }

        return backward.peek();
    }
    
    public String forward(int steps) {
        // Pop form forward into backword
        while(!forward.isEmpty() && steps != 0){
            backward.push(forward.pop());
            steps--;
        }
        return backward.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */