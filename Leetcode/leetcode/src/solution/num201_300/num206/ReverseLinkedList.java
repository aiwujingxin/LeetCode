package solution.num201_300.num206;

import baseclass.ListNode;


/**
 * @program: LeetCode
 * @description:
 * @author: jingxin Wu
 * @create: 2018-10-07 21:20
 **/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode resHead = new ListNode(head.val);

        while (second != null){
            first = resHead;
            resHead = second;
            second = resHead.next;
            resHead.next = first;
        }
        return resHead;
    }
}
