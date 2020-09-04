//package jianzhi;
//
///**
// * @Author: xhh
// * @Date: 2020/8/22 12:17
// * @Version 1.0
// */
//public class 矩阵中的路径12 {
//
//    int x = 0;
//    int y = 0;
//    int d[][] = {{0,1},{0,-1}, {1,0}, {-1,0}};
//
//    public boolean exist(char[][] board, String word) {
//        if (board == null || word == null || word =="") {
//            return false;
//        }
//        x = board[0].length;
//        y = board.length;
//        StringBuilder res = new StringBuilder();
//
//        for (int i = 0; i <board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                dfs(board, i, j, res, word);
//            }
//        }
//
//    }
//
//}
