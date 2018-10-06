package solution.num46;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-06 20:52
 **/

public class Permutations {


    /**
     *
     * time(n! * n) space:O(n)
     *
     * */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0 ) return res;
        helper(res, new ArrayList<>(), nums);
        return res;
    }

    private void helper(List<List<Integer>> res, ArrayList<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) continue; //O(n)
            list.add(nums[i]);
            helper(res, list, nums);
            list.remove(list.size() -1);
        }
    }


    /**
     * time  :O(n!)
     * space :O(n)
     * */
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0 ) return res;
        helper2(res, 0, nums);
        return res;
    }

    private void helper2(List<List<Integer>> res, int start, int[] nums) {
        if (start == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            helper2(res, start + 1 , nums);
            swap(nums, start ,i);
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2 ,3};
        Permutations permutations = new Permutations();
        permutations.permute2(a);
    }
}
