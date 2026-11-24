public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a != null && b != null){
            a = a.next;
            b = b.next;
        }
        if(a == null){
            //ya to b wali list ki len badhi h a ke ya frequal hai
            int bExtraLen = 0;
            while(b != null){
                bExtraLen++;
                b=b.next;
            }
            while(bExtraLen-- >0){
                headB = headB.next;

            }
        }
        else{
            // b == null
            //a wali list lengthy h b se ya far equal bhi h
            int aExtraLen = 0;
            while(a != null){
                aExtraLen++;
                a = a.next;               
            }
            while(aExtraLen-- > 0){
                headA = headA.next;
            }
        }

        //ab mere pass headA and headB iss tarike se lage hue h k unse start krte hue
        //end tak jaye to dono node me same no of node milengi
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;

            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        //aagafrn khai pr bhi commom node ni mili
        return null;
    }
}