class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        s=Counter(nums)
        for key,val in s.items():
            if val>2:
                return False
        return True
        