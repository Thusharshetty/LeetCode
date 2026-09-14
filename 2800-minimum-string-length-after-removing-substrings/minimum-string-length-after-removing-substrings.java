class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        int MinLength=s.length();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!st.isEmpty()&& ((st.peek()=='A' && c=='B')||(st.peek()=='C' && c=='D'))){
                st.pop();
                MinLength=MinLength-2;
            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}