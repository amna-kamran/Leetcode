class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<=2) return true;
        int x0= coordinates[0][0];
        int y0= coordinates[0][1];
        int x1=coordinates[1][0];
        int y1= coordinates[1][1];
        // double slope=(double) (y1-y0)/(x1-x0);
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0];
            int y= coordinates[i][1];
            // double varslope=(double)(y-y0)/(x-x0);
            // if(slope!=varslope || ) return false; 

            if((y1-y0)*(x-x0)!= (y-y0)*(x1-x0)) return false;
        }
    return true;
    }
}