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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode result =  ans;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        while(head!=null){
            map.put(head.val,map.getOrDefault(head.val,0)+1);
            head = head.next;
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                ans.next = new ListNode(i);
                ans = ans.next;
            }
        }
        return result.next;
    }
}