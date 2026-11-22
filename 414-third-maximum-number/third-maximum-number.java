class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long trdMax = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                trdMax = secMax;
                secMax = firstMax;
                firstMax = num;
            } else if (num > secMax && num != firstMax) {
                trdMax = secMax;
                secMax = num;
            } else if (num > trdMax && num != secMax && num != firstMax) {
                trdMax = num;
            }
        }

        return (trdMax == Long.MIN_VALUE) ? (int) firstMax : (int) trdMax;
    }
}
