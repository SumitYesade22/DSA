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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode prev=null;
        while(temp1!=null){
            ListNode nextnode=temp1.next;
            temp1.next=prev;
            prev=temp1;
            temp1=nextnode;
        }
        l1=prev;
        prev=null;
        while(temp2!=null){
            ListNode nextnode=temp2.next;
            temp2.next=prev;
            prev=temp2;
            temp2=nextnode;
        }
        l2=prev;
        ListNode ans=null;
        int sum;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            sum=0;
            if(l1!=null){
                sum+=l1.val;
                       l1 = l1.next;
            }

            if(l2!=null){
                sum+=l2.val;
                       l2 = l2.next;
            }
            sum+=carry;

            ListNode newnode=new ListNode(sum%10);
            carry=sum/10;
            newnode.next=ans;
            ans=newnode;

        }
        return ans;
    }
}