class Solution {
    public void reverseString(char[] s) {
        System.out.println (reversed(s,0,s.length-1));
    }
    public String reversed(char[] s,int l,int r){
        if(l>=r){
            return s.toString();
        }
        else{
           char temp=s[r];
           s[r]=s[l];
           s[l]=temp;
           return reversed(s,l+1,r-1);
        }
        

    }
}