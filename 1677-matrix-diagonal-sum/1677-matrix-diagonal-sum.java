class Solution {
    public int diagonalSum(int[][] mat) {
       int n = mat.length % 2 != 0 ? (mat.length + 1) / 2 : -1;

        int sum=0;
        int rev=mat.length-1;
        for(int i=0; i<mat.length; i++){
            if(i!=n-1){
                sum+=mat[i][i];
            }
            sum+=mat[rev--][i];
        }
    
        return sum;
    }
}
