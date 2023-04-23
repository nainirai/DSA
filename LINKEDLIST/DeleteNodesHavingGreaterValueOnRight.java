class Solution
{
    // reverse LinkedList
    public static Node reverse(Node head){
        Node prev=null;
        Node curr= head;
        Node next;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
        
    }
    Node compute(Node head)
    {
        // your code here
        head=reverse(head);
        Node curr=head;
        int max=head.data;
        Node prev=head;
        head=head.next;
        while(head!=null){
            if(head.data>=max){
                max=head.data;
                prev=head;
                head=head.next;
            }
            else{
                prev.next=head.next;
                head=prev.next;
            }
        }
        head=reverse(curr);
        return head;
    }
}
  
