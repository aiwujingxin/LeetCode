package solution.num41;

/**
 * @program: LeetCode
 * @description: 缺失的第一个正数
 * @author: jingxin Wu
 * @create: 2018-10-06 15:32
 **/

public class FirstMissingPositive {

    /**
     *
     * nums[nums[i] - 1] = nums[i];
     *
     * time O(n)
     * space O(1)
     * */

    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0 ) return 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] < nums.length && nums[nums[i] - 1]!= nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i +1 ;
            }
        }
        return nums.length + 1;
    }
}
