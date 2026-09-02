class Solution {
    public boolean isSubsequence(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        int i=0;
        int j=0;
        int n=a.length;
        int m=b.length;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==n){
            return true;
         }
         return false;
    }
}