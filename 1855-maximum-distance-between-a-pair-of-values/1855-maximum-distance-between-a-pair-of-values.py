class Solution:
    def maxDistance(self, nums1: List[int], nums2: List[int]) -> int:
        mx=0
        i=0
        j=0
        while i<len(nums1) and j<len(nums2):
            while j<len(nums2) and nums1[i]<=nums2[j]:
                mx=max(mx,j-i)
                j+=1
            i+=1
        return mx
            


        