class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode forward = curr.next;

            curr.next = prev;
            prev = curr;
            curr = forward;

        }

        //update -head -> prev 
        return prev;
        
    }
}