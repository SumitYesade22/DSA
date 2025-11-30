class Solution:
    def findLHS(self, nums: List[int]) -> int:
        s=Counter(nums)
        count=0
        for num in nums:
            if num+1 in s:
                count=max(count,s[num]+s[num+1])
        return count
        