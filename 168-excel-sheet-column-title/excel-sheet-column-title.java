class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder("");
        while(0<columnNumber){
            columnNumber--;
            char ch=(char)('A'+columnNumber%26);
            sb.append(ch);
            columnNumber=columnNumber/26;
        }
        return sb.reverse().toString();
    }
}