class Solution {
    public int maxScore(String s) {
        int zeros=0;
        int ones=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }else{
                ones++;
            }
        }
        int left=0;
        for(int i=0;i<s.length()-1;i++){
        int currMax=0;
             if(s.charAt(i)=='0'){
                left++;
               currMax=left+ones;
             }else{
                ones--;
                currMax=left+ones;
             }
        max=Math.max(max,currMax);
        }
        return max;
    }
}