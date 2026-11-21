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
        if (head==null){
            return head;
        }
        if (head.next==null){
            return head;
        }
        // > 1node 
        ListNode curr = head.next;
        ListNode prev = head;

        while(curr != null){
            if(prev.val != curr.val){
                prev = prev.next;
                curr = curr.next;
            }
            else{
                prev.next = curr.next;
                curr = curr.next;

            }
        }
        //yaha pr LL me saare duplicates remove ho chuke h
        return head;
    }
}