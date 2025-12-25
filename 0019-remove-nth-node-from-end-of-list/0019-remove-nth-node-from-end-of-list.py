# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head is None:
            return head
        l=0
        temp=head
        while temp:
            temp=temp.next
            l+=1
        stop=l-n+1
        temp=head
        prev=None
        while stop!=1:
            prev=temp
            temp=temp.next
            stop-=1
        if prev is None:
            head=head.next
        else:
            prev.next=temp.next
        return head
        
        

        