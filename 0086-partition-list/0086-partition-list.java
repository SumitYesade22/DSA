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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode small=new ListNode(0);
        ListNode large=new ListNode(0);
        ListNode Smalltemp=small;
        ListNode Largetemp=large;
        
        while(temp!=null){
            if(temp.val<x){
                small.next=temp;
                temp=temp.next;
                small=small.next;

            }else{
                large.next=temp;
                temp=temp.next;
                large=large.next;

            }
            
        }
        large.next=null;
        small.next=Largetemp.next;
 return Smalltemp.next;
        
    }
}