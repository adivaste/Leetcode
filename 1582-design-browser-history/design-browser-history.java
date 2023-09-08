class BrowserHistory {

    LinkedList<String> history;
    int currIndex;

    public BrowserHistory(String homepage) {
        history = new LinkedList<>();
        history.add(homepage);
        currIndex = 0;
    }
    
    public void visit(String url) {
        while(history.size() > currIndex + 1){
            history.removeLast();
        }
        history.add(url);
        currIndex++;
    }
    
    public String back(int steps) {
        this.currIndex = Math.max(0, currIndex - steps);
        return history.get(currIndex);
    }
    
    public String forward(int steps) {
        currIndex = Math.min(history.size() - 1, currIndex + steps);
        return history.get(currIndex);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */