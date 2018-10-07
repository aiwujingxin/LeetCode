package solution.num1_100.num92;

import baseclass.ListNode;

import java.util.List;

/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 21:13
 **/

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        for (int i = 1; i < m; i++) {
            cur = cur.next;
            pre = pre.next;
        }
        for (int i = 0; i < n -m ; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;

        }
        return dummy.next;
    }
}
