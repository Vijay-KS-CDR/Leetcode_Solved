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
    ListNode insert(ListNode tail,int sum){
        ListNode temp=new ListNode(sum);
        tail.next=temp;
        tail=temp;
        return tail;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=null;
        ListNode tail=null;
        ans=tail=new ListNode(0);
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            sum=carry;
            if(l1!=null && l2!=null){
                sum+=l1.val+l2.val;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }else if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
                carry=sum/10;
                sum=sum%10;
           tail=insert(tail,sum);
        }
        return ans.next;
    }
}