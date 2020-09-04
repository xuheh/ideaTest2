package tracing.扫雷游戏529;

/**
 * @author Lucien
 * @version 1.0
 * @date 2020/8/21 17:20
 */
class Solution529{
    static int[][] d = {{0,1},{0,-1},{1,0},{1,-1},{1,1},{-1,0},{-1,-1},{-1,1}};

    public char[][] updateBoard(char[][] board, int[] click) {
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        }
        dfs(board, click[0], click[1]);
        return board;
    }

    public static int getNum(char[][] board, int i, int j){
        int res = 0;
        int col = board.length - 1;
        int row = board[0].length - 1;
        for (int k = 0; k < d.length; k++) {

        }

        return res;
    }

    public static void dfs(char[][] board, int i, int j){
        int col = board.length;
        int row = board[0].length;
        if(i < 0 || j < 0 || i >= col || j >= row || board[i][j] != 'E')
            return ;
        int num = getNum(board, i, j);
        if(num == 0){
            board[i][j] = 'B';
            dfs(board, i, j - 1);
            dfs(board, i, j + 1);
            dfs(board, i - 1, j + 1);
            dfs(board, i - 1, j - 1);
            dfs(board, i - 1, j);
            dfs(board, i + 1, j + 1);
            dfs(board, i + 1, j - 1);
            dfs(board, i + 1, j);
        }else{
            board[i][j] = String.valueOf(num).charAt(0);
        }
    }
}
