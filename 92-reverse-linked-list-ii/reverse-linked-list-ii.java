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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left==right){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode lPrev = dummy;

        for(int i=1;i<left;i++){
            lPrev=lPrev.next;
        }

        ListNode lCurr=lPrev.next;

        ListNode rCurr=lCurr;
        for(int i=0;i<right-left;i++){
            rCurr=rCurr.next;
        }
        ListNode rNext=rCurr.next;

       ListNode prev = rNext;
        ListNode curr = lCurr;

        while(curr != rNext){

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        lPrev.next = prev;
        return dummy.next;
      
        
    }
}