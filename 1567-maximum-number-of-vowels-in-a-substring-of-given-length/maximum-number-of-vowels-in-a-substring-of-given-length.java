class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int currMax=0;
        for(int i=0;i<k;i++){
            if(vowels(s.charAt(i))){
                currMax++;
            }
        }
        max=currMax;
        for(int i=k;i<s.length();i++){
            if(vowels(s.charAt(i-k))){
                currMax--;
            }
            if(vowels(s.charAt(i))){
                currMax++;
            }
            max=Math.max(currMax,max);
        }
        return max;
    }
    private boolean vowels(char ch){
        if(ch == 'a' || ch== 'e' || ch== 'i' || ch=='o' || ch =='u'){
            return true;
        }
        return false;
    }
}