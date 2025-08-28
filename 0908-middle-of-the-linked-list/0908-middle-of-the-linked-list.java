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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        temp=head;
        if(n%2!=0){
            for(int i=1;i <= n/2 ;i++){
               temp=temp.next;
            }
            head=temp;}
        else{
             for(int i=1;i<=n/2;i++){
               temp=temp.next;
            }
            head=temp;
        }
      return head;  
    }
}