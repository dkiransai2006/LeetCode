class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i, j;
        int[][] tra= new int[n][m];

        for(i = 0; i<n; i++)
        {
            for(j = 0; j<m; j++)
            {
                tra[i][j] = matrix[j][i];
            }
        }
        return tra;
    }
}
