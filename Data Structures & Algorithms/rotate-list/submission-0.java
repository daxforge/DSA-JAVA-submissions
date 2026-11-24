class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //step 1 : make it circular and find length of LL
        if(head == null || k == 0){
            return head;
        }
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        //make it circular
        temp.next = head;

        //k ko update krdo
        k = k % len;
        //step2: link break and set. forward variable
        temp = head;
        for(int i =1; i<=len-k-1; i++){
            temp = temp.next;
        }
            ListNode forward = temp.next;
        
            //linkbreak
            temp.next = null;

            //return newHead of modified LL
            return forward;
        
    }
}