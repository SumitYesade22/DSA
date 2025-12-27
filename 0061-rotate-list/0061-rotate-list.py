# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head is None:
            return head
        l=0
        temp=head
        while temp:
            l+=1
            temp=temp.next
        k=k%l
        if k==0:
            return head
        k=l-k
        temp=head
        while k!=1:
            temp=temp.next
            k-=1
        prev=temp.next
        newhead=prev
        temp.next=None
        while prev.next:
            prev=prev.next
        prev.next=head
        return newhead



        