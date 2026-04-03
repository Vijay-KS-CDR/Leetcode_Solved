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
    int count(ListNode get){
        int c=0;
        while(get!=null){
            c++;
            get=get.next;
        }
        return c;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        int s=count(head);
        int deleting=s-n;
        if(n==s) return head.next;
        ListNode cur=head;
        for(int i=0;i<deleting-1;i++){
            cur=cur.next;
        }
        if(cur.next==null){
            return head;
        }
        cur.next=cur.next.next;
        return head;
    }
}