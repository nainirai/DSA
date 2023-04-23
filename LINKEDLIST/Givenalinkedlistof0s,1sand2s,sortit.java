class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                count0++;
                temp = temp.next;
            } else if (temp.data == 1) {
                count1++;
                temp = temp.next;
            } else {
                count2++;
                temp = temp.next;
            }
        }
        temp = head;
        while (count0 > 0) {
            temp.data = 0;
            temp = temp.next;
            count0--;
        }
        while (count1 > 0) {
            temp.data = 1;
            temp = temp.next;
            count1--;
        }
        while (count2 > 0) {
            temp.data = 2;
            temp = temp.next;
            count2--;
        }
        return head;

    
    }
}
