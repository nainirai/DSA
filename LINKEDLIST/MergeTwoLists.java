 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1st Approach
        // ListNode merg = new ListNode(0);
        // ListNode currNode = merg;
        // while(list1!=null && list2!=null){
        //     if(list1.val<=list2.val){
        //         currNode.next=list1;
        //         list1=list1.next;
        //     }
        //     else{
        //             currNode.next=list2;
        //             list2=list2.next;
        //         }
        //     currNode=currNode.next;
        // }
        //   currNode.next=list1==null?list2:list1;
        // return merg.next;

        //2nd approach 
         if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
