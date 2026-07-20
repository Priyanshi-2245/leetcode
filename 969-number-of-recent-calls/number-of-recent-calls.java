class RecentCounter {
    Queue<Integer> qu;
    int count=0;

    public RecentCounter() {
        qu=new ArrayDeque<>();
    }
    
    public int ping(int t) {
        qu.offer(t);
        count++;
        int n=t-3000;
        while(qu.peek()<n){
            qu.poll();
            count--;
           

        }
         return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */