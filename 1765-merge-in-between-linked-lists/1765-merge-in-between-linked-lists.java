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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
      ListNode temp=list1;
      ListNode prev=null;
      ListNode firstprev=null;
      ListNode secondprev=null;
      int n=0;
      while(n<=b){
        prev=temp;
        temp=temp.next;
        n++;
        if(n==a){
            firstprev=prev;
        }
        }
        secondprev=prev;
        firstprev.next=list2;
        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=secondprev.next;


return list1;
        
    }
}