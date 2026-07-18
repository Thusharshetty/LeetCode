class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        int lastindex=s.length()-1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                break;
            }else{
                lastindex-=1;
            }
        }
        while(lastindex>=0 && s.charAt(lastindex) !=' '){
            len++;
            lastindex--;
        }
        return len;
    }
}