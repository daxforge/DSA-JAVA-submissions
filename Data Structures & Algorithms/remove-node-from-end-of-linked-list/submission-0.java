
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode prev = head;
        ListNode curr = head;

        // Move curr by n steps
        for(int i = 1; i <= n; i++) {
            curr = curr.next;
        }

        // If curr becomes null, delete head
        if(curr == null) {
            return head.next;
        }

        // Move both pointers
        while(curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }

        // Delete the Nth node
        prev.next = prev.next.next;

        return head;
    }
}
