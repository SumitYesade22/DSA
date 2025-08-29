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
        Stack<Integer>st=new Stack<>();
        int i=1;
        ListNode temp=head;
        ListNode store=null;
        while(i<=right){
         if(i>=left){
            st.push(temp.val);
            if(i==left){
              store=temp;
            }
         }
         i++;
         temp=temp.next;

        }
        for(i=0;i<right-left+1;i++){
            store.val=st.peek();
            st.pop();
            store=store.next;
        }
    return head;   
    }
}