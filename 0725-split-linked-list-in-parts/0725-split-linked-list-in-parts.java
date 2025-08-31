class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        ListNode temp = head;
        int s = 0;

        while (temp != null) {
            temp = temp.next;
            s++;
        }

        int base = s / k;
        int extra = s % k;

        temp = head;
        int i = 0;
        ListNode prev = null;

        while (i < k) {
            if (temp != null) {
                int size = base + (extra > 0 ? 1 : 0);
                extra--;

                ListNode listhead = temp;

                while (size > 0) {
                    prev = temp;
                    temp = temp.next;
                    size--;
                }

                if (prev != null) prev.next = null;

                ans[i] = listhead;
            } else {
                ans[i] = null;
            }
            i++;
        }

        return ans;
    }
}
