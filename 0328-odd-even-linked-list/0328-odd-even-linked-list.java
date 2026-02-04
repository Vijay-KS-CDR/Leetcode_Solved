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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode refodd=odd,refeven=even;
        int pos=1;
        while(head!=null){
            ListNode temp=new ListNode(head.val);
            if(pos%2==0){
                refeven.next=temp;
                refeven=temp;
            }else{
                refodd.next=temp;
                refodd=temp;
            }
            pos++;
            head=head.next;
        }
        refodd.next=even.next;
        return odd.next;
    }
}