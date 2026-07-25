class Solution {
    public int[] findPeakGrid(int[][] mat) {
      int m = mat.length;
      int n = mat[0].length;
      int largest = mat[0][0];
      int largesti = 0, largestj = 0;
      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(mat[i][j] > largest){
                largest = mat[i][j];
                largesti = i;
                largestj = j;
            }
        }
      }
      return new int[]{largesti, largestj};
      
    }
}