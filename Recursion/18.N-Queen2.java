class Solution {
    List<List<String>> configs = new ArrayList<>();
    public void addOutput(boolean[][] chess, int n) {
        List<String> config = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            String curr = "";
            for (int col = 0; col < n; col++) {
                if (chess[row][col] == true)
                    curr = curr + "Q";
                else
                    curr = curr + ".";
            }
            config.add(curr);
        }
        configs.add(config);
    }

    public boolean isAttacking(boolean[][] chess, int row, int col) {
        // top
        for (int r = row; r >= 0; r--) {
            if (chess[r][col] == true)
                return true;
        }

        // top - left
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (chess[r][c] == true)
                return true;
        }

        // top - right
        for (int r = row, c = col; r >= 0 && c < chess.length; r--, c++) {
            if (chess[r][c] == true)
                return true;
        }

        return false;
    }

    public int solve(int n, int row, boolean[][] chess) {
        if (row == n) {
            addOutput(chess, n);
            return 1;
        }
        int ans = 0;
        for (int col = 0; col < n; col++) {
            if (isAttacking(chess, row, col) == false) {
                chess[row][col] = true;
                ans+=solve(n, row + 1, chess);
                chess[row][col] = false; // backtracking
            }
        }
        return ans;
    }
    public int totalNQueens(int n) {
        return solve(n,0,new boolean[n][n]);
    }
}
