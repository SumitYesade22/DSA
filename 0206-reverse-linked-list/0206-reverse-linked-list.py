# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head
        prev=head
        temp=head.next
        while temp is not None:
            store=temp.next
            temp.next=prev
            if prev==head:
                prev.next=None
            prev=temp
            temp=store
        return prev

        