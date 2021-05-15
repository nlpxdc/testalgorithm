package io.cjf.testalgorithm.sort.linkselectsort;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        ListNode listNode = new Solution().sortInList(listNode1);
    }

    public ListNode sortInList (ListNode head) {
        // write code here
        LinkedList<Integer> numbers = new LinkedList<>();
        for (ListNode c = head; c != null; c = c.next) {
            numbers.add(c.val);
        }
        Collections.sort(numbers);
        for (ListNode c = head; c != null; c = c.next) {
            c.val = numbers.pop();
        }
        return head;
    }
}
