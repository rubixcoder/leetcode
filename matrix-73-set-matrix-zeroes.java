class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Set<String> rowColSet = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowColSet.add(i + "-" + j);
                }
            }
        }

        for (String s: rowColSet) {
            int row = s.charAt(0) - '0';
            int col = s.charAt(2) - '0';

            setRowColZero(matrix, row, col, m, n);
        }
    }

    public void setRowColZero(int[][] matrix, int row, int col, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
                matrix[i][col] = 0;
            }
        }
    }
}
