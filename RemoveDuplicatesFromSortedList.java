/**
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Given the head of a sorted linked list, delete all duplicates such that each
 * element appears only once. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prevNode = head;
        ListNode currentNode = head.next;
        int val = head.val;

        while (currentNode != null) {
            if (currentNode.val == val) {
                // Remove duplicate node
                prevNode.next = currentNode.next;
            } else {
                prevNode = currentNode;
                val = currentNode.val;
            }
            currentNode = currentNode.next;
        }

        return head;
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}