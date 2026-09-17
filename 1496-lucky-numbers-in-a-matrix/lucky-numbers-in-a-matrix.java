class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix.length;int m=matrix[0].length;

        List<Integer> rowMin=new ArrayList<>();
        for(int i=0;i<n;i++){
            int rmin=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                rmin=Math.min(rmin,matrix[i][j]);
            }
            rowMin.add(rmin);
        }
         List<Integer> colMax=new ArrayList<>();
        for(int i=0;i<m;i++){
            int cmax=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                cmax=Math.max(cmax,matrix[j][i]);
            }
            colMax.add(cmax);
        }
        List<Integer> LuckyNumber=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)){
                    LuckyNumber.add(matrix[i][j]);
                }
            }
        }
        return LuckyNumber;
    }
}