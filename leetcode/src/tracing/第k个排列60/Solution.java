//package tracing.第k个排列60;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public String getPermutation(int n, int k) {
//
//
//
//        if ( n == 0 || k == 0) {
//            return null;
//        }
//
//        List<List<Integer>> lists = new ArrayList<>();
//
//        int[] visited = new int[n];
//        rank(n, k, new ArrayList<Integer>(), visited, lists);
//        return lists.get(k).toString();
//    }
//
//    private void rank(int n, int k, ArrayList<Integer> integers, int[] visited, List<List<Integer>> lists) {
//
//        if (integers.size() == n) {
//            k--;
//            return;
//        }
//
//        for (int i = 0; i < n; i++) {
//
//            if (visited[i] == 1) {
//                continue;
//            }
//            if (k == 0) {
//                return;
//            }
//            rank(n, k, );
//
//        }
//
//        return;
//    }
//}