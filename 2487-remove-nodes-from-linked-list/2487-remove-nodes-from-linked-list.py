# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return head
        stack=deque([])
        temp=head
        while temp:
            stack.append(temp.val)
            temp=temp.next
        max=-20**8
        prev=None
        while stack:
            node=stack.pop()
            if max>node:
                continue
            else:
                max=node
                new=ListNode(node)
                new.next=prev
                prev=new
        return prev

        