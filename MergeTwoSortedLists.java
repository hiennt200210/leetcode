public class MergeTwoSortedLists {

    /**
     * Merge Two Sorted Lists
     * https://leetcode.com/problems/merge-two-sorted-lists/
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode sortedList = new ListNode();
        ListNode sl = sortedList, l1 = list1, l2 = list2;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                sl.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                sl.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            sl = sl.next;
        }

        while (l1 != null) {
            sl.next = new ListNode(l1.val);
            l1 = l1.next;
            sl = sl.next;
        }

        while (l2 != null) {
            sl.next = new ListNode(l2.val);
            l2 = l2.next;
            sl = sl.next;
        }
        
        return sortedList.next;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
