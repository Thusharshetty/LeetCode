class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        int MinLength=s.length();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&& st.peek()=='A' && s.charAt(i)=='B'){
                st.pop();
                MinLength=MinLength-2;
            }else if(!st.isEmpty()&& st.peek()=='C' && s.charAt(i)=='D'){
                st.pop();
                MinLength=MinLength-2;
            }else{
                st.push(s.charAt(i));
            }
        }
        return MinLength;
    }
}