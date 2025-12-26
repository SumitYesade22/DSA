# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if len(lists)==0:
            return 
        final=self.solve(0,len(lists)-1,lists)
        return final
    def solve(self,st,ed,lists):
        if st==ed:
            return lists[st]
        mid=st+(ed-st)//2
        list1=self.solve(st,mid,lists)
        list2=self.solve(mid+1,ed,lists)
        merged=self.merge(list1,list2)
        return merged
    def merge(self,list1,list2):
        if list1 is None:
            return list2
        if list2 is None:
            return list1
        if list1.val<list2.val:
            list1.next=self.merge(list1.next,list2)
            return list1
        else:
            list2.next=self.merge(list1,list2.next)
            return list2

      