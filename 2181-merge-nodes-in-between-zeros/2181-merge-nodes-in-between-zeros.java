/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode answer = new ListNode();
        ListNode header = answer;
        int sum = 0;
        head = head.next;

        while(head != null) {
            if(head.val == 0) {
                ListNode newNode = new ListNode(sum);
                answer.next = newNode;
                answer = answer.next;
                sum = 0;
            } else
                sum += head.val;
            head = head.next;
        }

        return header.next;
    }
}