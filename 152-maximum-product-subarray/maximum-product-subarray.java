class Solution {
    public int maxProduct(int[] nums) {

        int maximum=nums[0];
        int minimum=nums[0];
        int ans= nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]<0){
                int temp=maximum;
                maximum=minimum;
                minimum=temp;
            }
            
            maximum=Math.max(nums[i],maximum*nums[i]);
            minimum=Math.min(nums[i],minimum*nums[i]);

            ans=Math.max(ans,maximum);

        }
        return ans;
    }
}