package solution.num1_100.num97;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 20:03
 **/

public class InterleavingString {

    /**
     * time : O(m * n) , space :O(m * n)
     * */
    public boolean isInterleave(String s1, String s2, String s3) {
        if ((s1.length() + s2.length()) != s3.length()) return false;

        boolean[][] dp = new boolean[s2.length() + 1][s1.length() + 1];
        dp[0][0] = true;
        // 第一行和第一列进行初始化
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i -1][0] && (s2.charAt(i -1) == s3.charAt(i - 1));

        }
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = dp[0][i-1] && (s1.charAt(i - 1) == s3.charAt(i - 1));
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = (dp[i- 1][j] && s2.charAt(i - 1) == s3.charAt(i + j - 1))
                        || (dp[i][j - 1] && s1.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }

        return dp[s2.length()][s1.length()];
    }
}
