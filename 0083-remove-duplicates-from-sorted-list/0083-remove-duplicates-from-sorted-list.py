# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp=head
        while temp is not None:
            prev=temp
            while temp.next is not None and temp.val==temp.next.val:
                temp=temp.next
            prev.next=temp.next
            temp=temp.next
        return head


        