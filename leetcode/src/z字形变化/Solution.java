package z字形变化;

class Solution {
    public static String convert(String s, int numRows) {
        int len = Math.min(s.length(), numRows);
        String[] rows = new String[len];

        for (int i = 0; i < rows.length; i++) {
            rows[i]="";
        }

        // 该字母要在第几行
        int loc = 0;
        // 判断字母是要向下放还是向上放
        boolean down=true;

        for (int i=0; i<s.length(); i++){
            rows[loc]+=s.substring(i, i+1);
            if ((loc +1) % numRows ==1 ){
                down = true;
            }
            else if ((loc+1) % numRows ==0){
                down = false;
            }
            if (down){
                loc ++;
            }
            else {
                loc--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String row : rows) {
            ans.append(row);
        }

        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(convert("AB", 3));
    }
}