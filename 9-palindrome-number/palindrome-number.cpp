class Solution {
public:
    bool isPalindrome(int x) {
        int temp = x ;
        long long revNum=0 ;
        if(x<0){
            return false;
        }
        while(x!=0){
            int rem = x % 10 ;
            x = x/10 ;

            if(revNum>INT_MAX/10 || (revNum==INT_MAX/10 && rem>7))
             return 0;
            if(revNum<INT_MIN/10 || (revNum==INT_MIN/10 && rem<-8))
             return 0;
             
            revNum = (revNum*10)+rem ;
        }
        if(temp==revNum){
            return true;
        }else{
            return false;
        }
    }
};