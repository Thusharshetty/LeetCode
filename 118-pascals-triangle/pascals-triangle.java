class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        int[][] ans=new int[n][n];
        List<List<Integer>> finalans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> currAns=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j){
                    ans[i][j]=1;
                    currAns.add(ans[i][j]);
                }else{
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                    currAns.add(ans[i][j]);
                }
            }
            finalans.add(currAns);
        }
        return finalans;
    }
}