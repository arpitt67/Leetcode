public class Leetcode19_Merge_two_sorted_LL {

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if(list1==null && list2==null){
                return list1;
            }
            if(list1==null && list2!=null){
                return list2;
            }
            if(list1!=null && list2==null){
                return list1;
            }
            ListNode L1=list1;
            ListNode L2=list2;
            ListNode h=null;
            ListNode tail=null;

            while(L1!=null && L2!=null){
                if(L1.val<=L2.val){
                    if(h==null){
                        h=L1;
                        tail=L1;
                        L1=L1.next;
                    }
                    else{
                        tail.next=L1;
                        tail=L1;
                        L1=L1.next;
                    }
                }
                else{
                    if(h==null){
                        h=L2;
                        tail=L2;
                        L2=L2.next;
                    }
                    else{
                        tail.next=L2;
                        tail=L2;
                        L2=L2.next;
                    }
                }
            }
            while(L1!=null){
                tail.next=L1;
                tail=L1;
                L1=L1.next;
            }
            while(L2!=null){
                tail.next=L2;
                tail=L2;
                L2=L2.next;
            }

            return h;}
    }
}
