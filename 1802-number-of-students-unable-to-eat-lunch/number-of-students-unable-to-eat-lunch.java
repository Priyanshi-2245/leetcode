class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> s = new ArrayDeque<>();
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < sandwiches.length; i++) {
            s.offer(sandwiches[i]);
        }
        for (int i = 0; i < students.length; i++) {
            q.offer(students[i]);
        }
        int count=0;
        while(count!=q.size()){
            if (s.peek() == q.peek()) {
                s.poll();
                q.poll();
                count=0;
            } else {
                q.offer(q.poll());
                count++;
            }
            
        }
        return q.size();
    }
}