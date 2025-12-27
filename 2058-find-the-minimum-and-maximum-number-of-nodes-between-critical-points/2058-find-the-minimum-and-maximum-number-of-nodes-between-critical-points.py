# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def nodesBetweenCriticalPoints(self, head: Optional[ListNode]) -> List[int]:
        if not head or not head.next or not head.next.next:
            return [-1,-1]

        first = -1
        last = -1
        l = 1                      # start from index 1 (temp = second node)
        prev = head
        temp = head.next
        minv = float('inf')

        while temp.next:
            # critical point check
            if (prev.val < temp.val and temp.val > temp.next.val) or \
               (prev.val > temp.val and temp.val < temp.next.val):

                if first == -1:           # first critical point
                    first = l
                    last = l
                else:
                    minv = min(minv, l - last)
                    last = l

            prev = temp
            temp = temp.next
            l += 1

        if first == last:                 # less than 2 CP
            return [-1,-1]

        return [minv, last - first]
        