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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head ;
        for(int i = 1; i<=(k-1); i++){
            first = first.next;
        }
         //first kth-> node from beginning
         ListNode temp = first.next;
         ListNode second = head;
         //iss window ko move kia 1 step at a time
         while(temp!=null){
            temp = temp.next;
            second = second.next;

         }
         //ab temp null ke uppr h,
         //iska mtlb second node -> kth node from end
         //ab i can swap values
         int tempValue = first.val;
         first.val = second.val;
         second.val = tempValue;
         //return modified LL Ka head
         return head;


        
    }
}