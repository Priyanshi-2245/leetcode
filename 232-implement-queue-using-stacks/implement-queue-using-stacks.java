class MyQueue {
    Stack<Integer> st;
    Stack<Integer> sk;

    public MyQueue() {
        st=new Stack<>();
        sk=new Stack<>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            sk.push(st.pop());
        }
        st.push(x);
        while(!sk.isEmpty()){
            st.push(sk.pop());
        }

    }
    
    public int pop() {
       return st.pop();
    }
    
    public int peek() {
       return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
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