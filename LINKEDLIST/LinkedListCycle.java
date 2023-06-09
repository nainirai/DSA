
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null){
            return false;
        }
        // ListNode slow = head;
        // ListNode fast = head;
        // while(fast!=null && fast.next!=null){
        //     slow=head.next;
        //     fast=head.next.next;
        //     if(slow==fast){
        //         return true;
        //     }
        // }
        //  return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast){
              slow=slow.next;
              if(fast!=null && fast.next!=null){
                  fast=fast.next.next;
              }
              else{
                  return false;
              }
        }
        return true;
    }
