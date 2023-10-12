class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }

        int delX = coordinates[1][0] - coordinates[0][0];
        int delY = coordinates[1][1] - coordinates[0][1];

        for (int i = 1; i < coordinates.length - 1; i++) {
            int newDelX = coordinates[i + 1][0] - coordinates[i][0];
            int newDelY = coordinates[i + 1][1] - coordinates[i][1];

            if (delX * newDelY != delY * newDelX) {
                return false;
            }
        }

        return true;
    }
}
