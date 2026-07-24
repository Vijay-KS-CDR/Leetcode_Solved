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
       ListNode fin=new ListNode(0);
       ListNode ans=fin;
        boolean first = true;
        boolean second = false;
        int sum=0;
        head=head.next;
        while(head!=null){
            sum+=head.val;
            if(head.val==0){
               second=true;
            }
            if(first && second){
                ans.next=new ListNode(sum);
                ans=ans.next;
                sum=0;
                second=false;
            }
            head=head.next;
        }
        return fin.next;
    }
}