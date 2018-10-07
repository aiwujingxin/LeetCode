package solution.num1_100.num70;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 23:04
 **/

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int one = 1;
        int two = 2;
        int result = 0;
        for(int i = 2; i < n ; i++) {
            result = one  + two;
            one = two;
            two = result;
        }
        return result;
    }
}
