class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int N=image.length;
        int M=image[0].length;
        int ans[][]=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                ans[i][M-1-j]=image[i][j];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
               if(ans[i][j]==0){
                ans[i][j]=1;
               }else{
                ans[i][j]=0;
               }
            }
        }
        return ans;
    }
}