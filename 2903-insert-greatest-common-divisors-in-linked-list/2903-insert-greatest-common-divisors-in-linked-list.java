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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
    ListNode temp=head;
    ListNode prev=temp;
    temp=temp.next;
    if(head==null){
        return head;
    }
    while(temp!=null){
        int res=gcd(prev.val,temp.val);
        ListNode node=new ListNode(res);
        node.next=prev.next;
        prev.next=node;
        prev=temp;
        temp=temp.next;
        
    }
      return head;  
    }
    public int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}