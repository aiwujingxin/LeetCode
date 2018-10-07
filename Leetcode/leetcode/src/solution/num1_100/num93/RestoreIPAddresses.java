package solution.num1_100.num93;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 21:45
 **/

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(res, s, 0, "",0);
        return res;
    }

    private void helper(List<String> res, String s, int index, String ret, int count) {
        if (count > 4) return;
        if (count == 4 && index == s.length()) {
            res.add(ret);
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) break;
            String temp = s.substring(index, index + i);
            if ((temp.startsWith("0") && temp.length() > 1 )|| (i == 3 &&
                    Integer.parseInt(temp) >= 256)) continue;
            helper(res, s, index + i, ret + temp + (count == 3 ?"": "."), count + 1);
        }
    }

    public static void main(String[] args) {
        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        restoreIPAddresses.restoreIpAddresses("25525511135");
    }
}
