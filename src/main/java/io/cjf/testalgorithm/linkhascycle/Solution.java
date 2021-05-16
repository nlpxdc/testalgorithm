package io.cjf.testalgorithm.linkhascycle;

public class Solution {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        for (ListNode slow = head, fast = head; slow != null && fast != null; ) {
            if (fast.next == slow) {
                return true;
            }
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = fast.next;
            }

        }
        return false;
    }
}
