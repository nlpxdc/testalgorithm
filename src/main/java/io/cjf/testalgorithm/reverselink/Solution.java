package io.cjf.testalgorithm.reverselink;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ListNode listNode = solution.ReverseList(listNode1);
    }

    public ListNode ReverseList(ListNode head) {
        ListNode changeToNext = null;

//        while (current != null) {
//            ListNode bakNext = current.next;
//            current.next = changeToNext;
//            changeToNext = current;
//            current = bakNext;
//        }

        ListNode bakNext;
        for (ListNode c = head; c != null; c = bakNext) {
            bakNext = c.next;
            c.next = changeToNext;
            changeToNext = c;
        }

        return changeToNext;
    }
}
