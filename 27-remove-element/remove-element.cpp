class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int n = nums.size();
        int writeIndex=0;
        for(int readIndex=0 ; readIndex<n ; readIndex++){
            if(nums[readIndex]!=val){
                nums[writeIndex]=nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
};