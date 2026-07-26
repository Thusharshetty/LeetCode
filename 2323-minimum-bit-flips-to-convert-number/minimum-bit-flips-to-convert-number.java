class Solution {
    public int minBitFlips(int start, int goal) {
        int finalvalue = start ^ goal;
        int n = 0;
        while (finalvalue > 0) {
            if ((finalvalue & 1) != 0) {
                n++;
            }
            finalvalue = finalvalue >> 1;
        }
        return n;
    }
}