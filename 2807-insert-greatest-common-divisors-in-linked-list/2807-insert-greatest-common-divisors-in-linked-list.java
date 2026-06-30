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
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null) return head;
        ListNode cur=head,prev=null;
        while(cur.next!=null){
            int a=cur.val;
            int b=cur.next.val;
            int ans=gcd(a,b);
            ListNode h=new ListNode(ans);
            ListNode temp=cur.next;
            cur.next=h;
            h.next=temp;
            cur=h.next;
        }
        return head;
    }
}