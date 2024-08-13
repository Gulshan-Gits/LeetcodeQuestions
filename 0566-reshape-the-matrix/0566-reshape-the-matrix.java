class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        int x=0;
        int y=0;

        int[][] reshapedmat = new int[r][c];

        if(m*n != r*c){
            return mat;
        }

        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(y==c){
                    x++;
                    y=0;
                }
            reshapedmat[x][y] = mat[i][j];
            y++;
            }
        }
        return reshapedmat;
    }
}