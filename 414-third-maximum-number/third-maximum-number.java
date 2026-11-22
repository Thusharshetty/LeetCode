class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long trdMax = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                trdMax = secMax;
                secMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secMax && nums[i] != firstMax) {
                trdMax = secMax;
                secMax = nums[i];
                
            } else if (nums[i] > trdMax && nums[i] != secMax && nums[i]!=firstMax) {
                trdMax = nums[i];
            }
        }
        if (trdMax == Long.MIN_VALUE) {
            return (int)firstMax;
        }
        return (int)trdMax;
    }
}