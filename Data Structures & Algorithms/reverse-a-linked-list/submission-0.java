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
    public ListNode reverseList(ListNode head) {

        Stack<Integer> ST = new Stack<>();

        ListNode temp = head;

        while(temp != null){
            ST.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(!ST.isEmpty()){
            curr.next = new ListNode(ST.pop());
            curr = curr.next;
        }

        return dummy.next;
        
    }
}
