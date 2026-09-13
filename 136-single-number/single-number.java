class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int ans:nums){
            result^=ans;
        }
        return result;

    }
}