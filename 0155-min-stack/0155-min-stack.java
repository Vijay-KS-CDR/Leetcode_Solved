class Pair{
    int a,b;
    Pair(int a,int b){
        this.a = a;
        this.b = b;
    }
}

class MinStack {
    Stack<Pair> stk=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(stk.isEmpty()){
            stk.push(new Pair(val,val));
        }
        else{
            int prevmin=Math.min(stk.peek().b,val);
            stk.push(new Pair(val,prevmin));
        }
    }
    
    public void pop() {
        if(stk.isEmpty()){
            return ;
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek().a;
    }
    
    public int getMin() {
        return stk.peek().b;
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