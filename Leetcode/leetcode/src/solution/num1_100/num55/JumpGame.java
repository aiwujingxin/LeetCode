package solution.num1_100.num55;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-06 20:20
 **/

public class JumpGame {


    /**
     *time： O(n) ; space:O(1)
     * */
    public boolean canJump(int[] nums) {
       int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}
