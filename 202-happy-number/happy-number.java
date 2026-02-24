class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int newSum=0;
            while(n>0){
                int digit=n%10;
                newSum += (digit*digit);
                n=n/10; 
            }
            n=newSum;
        }
        return n==1;
    }
}