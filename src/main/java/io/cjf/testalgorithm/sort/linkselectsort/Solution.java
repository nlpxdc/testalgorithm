package io.cjf.testalgorithm.sort.linkselectsort;

import java.util.*;

public class Solution {

    public ListNode sortInList (ListNode head) {
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
        }
        return head;
    }
}
