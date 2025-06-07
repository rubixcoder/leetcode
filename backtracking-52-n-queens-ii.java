class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];

        func(board, n, 0);

        return count;
    }

    public void func(boolean[][] board, int n, int row) {
        if (row == n) {
            count++;
            return;
        }

        // Adding queen in row
        for (int col = 0; col < n; col++) {
            board[row][col] = true;
            if (isValid(board, n, row, col)) {
                func(board, n, row + 1);
            }
            board[row][col] = false;
        }

        return;
    }

    public boolean isValid(boolean[][] board, int n, int row, int col) {
        for (int i = 0; i < n; i++) {
            if (i != col && board[row][i]) { // row check
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != row && board[i][col]) { // col check
                return false;
            }
        }

        int tr = row + 1;
        int tc = col + 1;

        while (tr < n && tc < n) {
            if (board[tr][tc]) {
                return false;
            }
            tr++;
            tc++;
        }

        tr = row - 1;
        tc = col - 1;

        while (tr >= 0 && tc >= 0) {
            if (board[tr][tc]) {
                return false;
            }
            tr--;
            tc--;
        }

        tr = row - 1;
        tc = col + 1;

        while (tr >= 0 && tc < n) {
            if (board[tr][tc]) {
                return false;
            }
            tr--;
            tc++;
        }

        tr = row + 1;
        tc = col - 1;

        while (tr < n && tc >= 0) {
            if (board[tr][tc]) {
                return false;
            }
            tr++;
            tc--;
        }

        return true;
    }
}
