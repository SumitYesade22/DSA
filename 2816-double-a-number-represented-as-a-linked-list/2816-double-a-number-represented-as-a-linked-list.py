# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return
        carry=self.solve(head)
        if carry==0:
            return head
        prev=ListNode(carry)
        prev.next=head
        return prev

    def solve(self,head):
        if head is None:
            return 0
        carry=self.solve(head.next)
        val=head.val*2+carry
        head.val=val%10
        return val//10
        

        