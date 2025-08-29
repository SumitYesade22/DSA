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
    public ListNode reverseList(ListNode head) {
         if (head == null) return null;
        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null){

            ListNode store=temp.next;
            temp.next=prev;
             if(prev==head){
                prev.next=null;
            }
            prev=temp;
            temp=store;
            
           

        }
    return prev; 
    }
}