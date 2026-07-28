class Solution {
    public int numberOfSteps(int num) {
        int step=0;
        int ans=counts(num,step);
        return ans;
    }
    int counts(int num,int step){
        if(num==0){
            return step;
        }
        else if(num%2==0){
            return counts(num/2,++step);
        }
        else{return counts(num-1,++step);}
        
    }

}