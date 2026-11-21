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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode ansHead = dummy;
        ListNode ansTail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ansTail.next = list1;
                list1 = list1.next;
                ansTail = ansTail.next;
            }
            else{
                ansTail.next = list2;
                list2 = list2.next;
                ansTail = ansTail.next;

            }
        }
        //jaha par list fully consume hagayi h & ek bachi h
        //lets says fully consume nhi hui,but list2 hogyi
        if(list1 != null){
            ansTail.next = list1;
        }
        //lets say list 2 fully consume nhai hai but list1 haogyi
        if(list2 != null){
            ansTail.next = list2;
        }
        //ans list porri ready h bs dummy node remove krni h
        ansHead = ansHead.next;
        dummy.next = null;
        return ansHead;

    }
}