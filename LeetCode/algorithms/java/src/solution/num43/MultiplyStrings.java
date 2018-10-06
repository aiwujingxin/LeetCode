package solution.num43;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-06 14:27
 **/


/**
 * time :O(n * m)
 * space : O(n + m)
 * */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) return "0";

        int[] digits = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0 ; i--) {
            for (int j = num2.length() - 1; j >= 0 ; j--) {
                int product = (num1.charAt(i) - '0' ) * (num2.charAt(j) - '0' );
                int p1 = i + j, p2 = i + j + 1;
                int sum = product + digits[p2];
                digits[p1] += sum / 10;
                digits[p2] = sum % 10;

            }
        }

        StringBuffer res = new StringBuffer();
        for (int digit : digits) {
            if (!(digit == 0 && res.length() == 0)) {
                res.append(digit);
            }
        }

        return res.length() == 0 ? "0" : res.toString();

    }
}
