# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nextLargerNodes(self, head: Optional[ListNode]) -> List[int]:
        l=[]
        while head:
            l.append(head.val)
            head=head.next
        res=[0]*len(l)
        stack=deque()
        for i in range(len(l)-1,-1,-1):
            while len(stack)!=0 and stack[-1]<=l[i]:
                stack.pop()
            if len(stack)!=0:
                res[i]=stack[-1]
            stack.append(l[i])

        return res


        