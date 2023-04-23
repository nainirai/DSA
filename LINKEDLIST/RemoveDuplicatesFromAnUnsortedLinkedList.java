class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> set = new HashSet<>();         //creating hashset  
         
         Node curr=head;
         Node prev=null;
         while(curr!=null){
             int currval = curr.data;
             if(set.contains(currval)){
                 prev.next=curr.next;
             }
             else{
                 set.add(currval);
                 prev=curr;
             }
             curr=curr.next;
         }
         return head;
    }
}
// time complexity O(n) {as loop we used }
// space complexity O(n) as hashset is used 
