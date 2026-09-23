/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prev = new ListNode(0);
        ListNode dummy = prev;
        prev.next = head;

        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }
 
        return dummy.next;
    //    ArrayList<Integer> lst = new ArrayList<>();
    //    ListNode curr = head;
    //    while(head != null){
    //     lst.add(head.val);
    //     head = head.next;
    //    }

    //    int i = 0 ;
    //    while(i < lst.size() && i+1 < lst.size()){
    //         int temp1 = lst.get(i);
    //         lst.set(i,lst.get(i+1));
    //         lst.set(i+1,temp1);
    //         i += 2;            
    //    }

    //    ListNode res = new ListNode(0);
    //    ListNode dummy = res;
    //    i = 0;
    //    while(i < lst.size()){
    //     res.next = new ListNode(lst.get(i));
    //     res = res.next; 
    //     i += 1;
    //    }

    //    return dummy.next;
    }
}





 // ListNode res = head;
        // while(head != null && head.next != null){
        //     int temp = head.next.val;
        //     head.next.val = head.val;
        //     head.val = temp;
        //     head = head.next.next;
        // }
        // return res;