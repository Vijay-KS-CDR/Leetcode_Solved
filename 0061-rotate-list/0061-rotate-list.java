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
    int count(ListNode temp){
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }

        int c=count(head);
        k=k%c;
        if(k==0){
            return head;
        }
        k=c-k-1;
        ListNode temp=head;
        while(temp!=null && k!=0){
            temp=temp.next;
            k--;
        }
        ListNode resume=temp.next;
        ListNode result=resume;
        temp.next=null;
        while(resume.next!=null){
            resume=resume.next;
        }
        resume.next=head;
        return result;
    }
}