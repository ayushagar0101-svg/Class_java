package DSA;

//leetcode 19. Remove Nth Node From End of List

public class Remov_nth_node_from_linkedlist {
    
      public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(n==count){
            return head.next;
        }
        ListNode temp1 = head;
        for(int i = 0;i<count-n-1;i++){
            temp1 = temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}
