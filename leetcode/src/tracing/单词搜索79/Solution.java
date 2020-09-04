package tracing.单词搜索79;

import org.junit.Test;

/**
 * @Author: xhh
 * @Date: 2020/7/25 11:28
 * @Version 1.0
 */
public class Solution {

    // 二维空间的x
    int m;
    // 二维空间的Y
    int n;
    // 存储已经走过的路径
    boolean[][] mark;
    // 设置上下左右的偏移量
    int[][] d = {{-1,0}, {1,0}, {0,-1},{0,1}};

    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        m = board.length;
        n = board[0].length;

        mark = new boolean[m][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (searchWord(board, word, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * 从board[x][y]开始，寻找word[index.....word.size]
     * @param board
     * @param word
     * @param index
     * @param startX
     * @param startY
     * @return
     */
    public boolean searchWord(char[][] board, String word, int index, int startX, int startY) {

        if (index == word.length()-1) {
            return board[startX][startY] == word.charAt(index);
        }

        if (board[startX][startY] == word.charAt(index)) {
            mark[startX][startY] = true;
            for (int i = 0; i < 4; i++) {
                int newX = startX + d[i][0];
                int newY = startY + d[i][1];
                if (inArea(newX, newY) && !mark[newX][newY]) {
                    if (searchWord(board, word, index+1, newX, newY)) {
                        return true;
                    }
                }
            }
//            mark[startX][startY] = false;
        }

        return false;
    }

    public boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }


    @Test
    public void test() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board, "ABCCED"));
    }


}
