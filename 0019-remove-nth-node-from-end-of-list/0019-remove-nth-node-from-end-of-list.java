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
    public ListNode removeNthFromEnd(ListNode head, int n) {
         int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(length==1){
            return null;
        }
        int num=length-n+1;
        ListNode prev=null;
        temp=head;
        while(num!=1){
            prev=temp;
            temp=temp.next;
            num--;
        }
        if(prev!=null){
             prev.next=temp.next;
        }else{
            head=head.next;
        }
       
       
        return head;
    }
}