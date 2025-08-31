class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;  
        int sum = 0;
        
        ListNode dummy = new ListNode(0); 
        ListNode curr = dummy;
        
        while (temp!= null) {
            if (temp.val == 0) {
               
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0; 
            } else {
                sum += temp.val; 
            }
            temp = temp.next;
        }
        
        return dummy.next; 
    }
}
