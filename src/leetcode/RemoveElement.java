package leetcode;

import java.util.List;

public class RemoveElement {

    public ListNode removeElements(ListNode head, int val) {
        ListNode pr = head;
        ListNode c = head.next;
        while(c != null){
            if(c.val == val){
                pr.next = c.next;
                c = c.next;
            }else{
                pr = c;
                c = c.next;
            }
        }
        return head;
    }
}
