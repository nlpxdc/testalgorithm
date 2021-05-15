package io.cjf.testalgorithm.sort.linkselectsort;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        solution.sortInList(listNode1);

    }

    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public void sortInList (ListNode head) {
        // write code here
        for (ListNode i = head; i != null; i = i.next) {
            ListNode min = i;
            for (ListNode j = i.next; j != null; j = j.next) {
                if (min.val > j.val) {
                    min = j;
                }
            }
            if (i != min) {
                int t = i.val;
                i.val = min.val;
                min.val = t;
            }
//            int t = i.val;
//            i.val = min.val;
//            min.val = t;
        }
//        return head;
    }
}
