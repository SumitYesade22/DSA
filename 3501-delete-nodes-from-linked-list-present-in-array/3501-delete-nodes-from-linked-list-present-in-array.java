class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while (temp.next != null) {
            if (set.contains(temp.next.val)) {
                temp.next = temp.next.next; 
            } else {
                temp = temp.next; 
            }
        }
        return dummy.next;
    }
}
