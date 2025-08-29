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
    public int pairSum(ListNode head) {
        int n=0;
        Stack<Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int mid=n/2;
        temp=head;
        ListNode midtemp=head;
        for(int i=0;i<mid;i++){
            temp=temp.next;
        }
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        int MaxSum=Integer.MIN_VALUE;
        int sum=0;
        while(!st.isEmpty()){
           sum = midtemp.val+st.peek();
           st.pop();
           MaxSum=Math.max(sum,MaxSum);
           midtemp=midtemp.next;

        }
       return MaxSum; 
    }
}