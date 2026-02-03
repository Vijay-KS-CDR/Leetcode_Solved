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
    ListNode reverse(ListNode head){
        ListNode cur=head,prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    int count(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    ListNode mid(ListNode head){
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    boolean checker(ListNode a,ListNode b){
        while(b!=null){
            if(a.val!=b.val){
                return false;
            }
            a=a.next;
            b=b.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head){
       int c=count(head);
       ListNode check=mid(head);
       ListNode temp=null;
       if(c%2==0){
        temp=reverse(check);
       }
       else{
        temp=reverse(check.next);
       }
       return checker(head,temp);
    }
}