class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode write = head;
        ListNode read = head.next;

        while(read != null){
            int sum = 0;
            //calculate sum ki value untill u get 0 is the node
            while(read.val != 0){
                sum = sum + read.val;
                read = read.next;
            }
            //insert sum ki value write wali position pr
            write.val = sum;
            //delete fltu nodes
            write.next = read.next;
            //read and write ko move kr do 1 steps
            read = read.next;
            write = write.next;
        }
        return head;
        
    }
}