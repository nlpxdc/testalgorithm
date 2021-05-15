package io.cjf.testalgorithm.sort.linkselectsort;

public class Solution3 {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ListNode listNode = new Solution3().sortInList(listNode1);
    }

    public ListNode sortInList (ListNode head) {
        // write code here
        int size = 0;
        for (ListNode c = head; c != null; c = c.next) {
            size++;
        }
        int[] numbers = new int[size];
        ListNode c = head;
        for (int i = 0; i < size; i++) {
            numbers[i] = c.val;
            c = c.next;
        }
        return head;
    }
}
