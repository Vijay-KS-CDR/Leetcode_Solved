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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> lst = new ArrayList<>();
        ListNode s=head,ans=head;
        while(s!=null){
            lst.add(s.val);
            s=s.next;
        }
        Collections.sort(lst);
        for(int i:lst){
            ans.val=i;
            ans=ans.next;
        }
        return head;
    }
}