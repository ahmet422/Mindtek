package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // length of given linked list?
        int length = 0;
        ListNode curr = n1;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
            length++;
        }

        curr = n1;
        ListNode prev = null;
        int ind = 2;
        int i = 0;
        while(i<ind){
            prev = curr;
            curr=curr.next;
            i++;

        }
        System.out.println();
       System.out.println(curr.val);
        System.out.println(prev.val);
        prev.next = curr.next;
        curr.next = null;

        curr = n1;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
            length++;
        }
    }

    public ListNode middleNode(ListNode head) {

        int length = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        int ind = 0;

        curr = head;
        while(curr != null){
            curr = curr.next;
            ind++;
            if(ind==length/2) return curr;
        }
        return null;
    }

    public ListNode middleNode1(ListNode head) {
        ListNode sn = head, fn = head;
        while(fn != null && fn.next != null){
            sn = sn.next;
            fn = fn.next.next;
        }
        return sn;
    }
}
