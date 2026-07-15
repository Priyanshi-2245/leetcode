class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if (s.equals("+")){
                int c1=st.pop();
                int c2=st.peek();
                st.push(c1);
                st.push(c1+c2);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}