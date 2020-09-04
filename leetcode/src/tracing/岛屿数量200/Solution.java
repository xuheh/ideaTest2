package tracing.岛屿数量200;

import org.junit.Test;

/**
 * @Author: xhh
 * @Date: 2020/7/26 11:51
 * @Version 1.0
 */
public class Solution {

    int m;
    int n;
    // 表示上下左右四个方向
    int[][] d = {{0,1},{0,-1},{1,0},{-1,0}};
    // 存储是岛屿的坐标
    boolean[][] visited;



    public int numIslands(char[][] grid) {
        int res = 0;
        if (grid.length == 0) {
            return res;
        }
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(grid, i , j);
                }
            }
        }

        return res;
    }

    private void dfs(char[][] grid, int i, int j) {


        visited[i][j] = true;
        for (int k = 0; k < d.length; k++) {
            int newI = i + d[k][0];
            int newJ = j + d[k][1];
            if (inArea(newI, newJ) && grid[newI][newJ] == '1') {
                dfs(grid, newI, newJ);
            }
        }
        return;


    }

    public boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    @Test
    public void test() {

    }

}
