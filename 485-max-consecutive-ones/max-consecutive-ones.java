class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count=0;
        int maximumOnes=0;
        for(int number : nums){
            if(number==1){
                count++;
                maximumOnes=Math.max(maximumOnes,count);
            }
            else{
                count=0;
            }
        }
        return maximumOnes;
    }
}