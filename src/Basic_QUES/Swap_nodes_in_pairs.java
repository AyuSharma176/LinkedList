package Basic_QUES;

public class Swap_nodes_in_pairs {
//    class Solution {
//        public ListNode swapPairs(ListNode head) {
//            if(head==null || head.next==null){
//                return head;
//            }
//            ListNode news= head.next;
//            head.next=swapPairs(news.next);
//            news.next=head;
//            return news;
//        }
//    }
    //using while loop
//    if(head==null || head.next==null){
//        return head;
//    }
//    ListNode h1=head;
//    ListNode h2=head.next;
//
//    while(h1.next!=null && h2.next!=null){
//        int temp=h1.val;
//        h1.val=h2.val;
//        h2.val=temp;
//        h1=h2.next;
//        if(h1.next!=null){
//            h2=h1.next;
//        }else{
//            return head;
//        }
//
//    }
//    int temp=h1.val;
//    h1.val=h2.val;
//    h2.val=temp;
//
//     return head;
}
