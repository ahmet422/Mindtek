package leetcode;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

    }

    public boolean hasCycle(ListNode head) {
      ListNode oneS = head;
      ListNode twoS = head;

      while (twoS.next != null && twoS != null){
          oneS = oneS.next;
          twoS = twoS.next.next;
          if(oneS == twoS) return true;
      }
      return false;
    }
}
