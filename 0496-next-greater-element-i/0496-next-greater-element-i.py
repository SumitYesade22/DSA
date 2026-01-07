class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack=deque()
        mp=defaultdict(int)
        n=len(nums2)
        for i in range(n-1,-1,-1):
            while len(stack)!=0 and stack[-1]<=nums2[i]:
                stack.pop()
            if len(stack)==0:
                mp[nums2[i]]=-1
            else:
                mp[nums2[i]]=stack[-1]
            stack.append(nums2[i])
        for i in range(len(nums1)):
            nums1[i]=mp[nums1[i]]
        return nums1
        