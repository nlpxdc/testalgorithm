package io.cjf.testalgorithm.sort.linkselectsort;

public class Solution4 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ListNode listNode = new Solution4().sortInList(listNode1);
    }

    public ListNode sortInList (ListNode head) {
        // write code here
        for (ListNode i = head; i != null; i = i.next) {
            for (ListNode j = i.next; j != null; j = j.next) {
                if (i.val > j.val) {
                    int t = i.val;
                    i.val = j.val;
                    j.val = t;
                }
            }
        }
        return head;
    }
}
