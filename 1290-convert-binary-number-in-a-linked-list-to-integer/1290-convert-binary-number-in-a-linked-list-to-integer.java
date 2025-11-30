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
/**
 * Definition for singly-linked list.
 * class ListNode {
 *   int val;
 *   ListNode? next;
 *   ListNode([this.val = 0, this.next]);
 * }
 */
class Solution {
  int getDecimalValue(ListNode head) {
    ListNode temp=head;
    int num=0;
    while(temp!=null){
        num++;
        temp=temp.next;
    }
    num=num-1;
    int sum=0;
    while(head!=null){
        sum+=((int)(Math.pow(2,num))*head.val);
        head=head.next;
        num--;
    }
    return sum;
  }
}