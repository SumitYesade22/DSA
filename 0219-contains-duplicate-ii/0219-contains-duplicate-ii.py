class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        see={}
        for i in range(len(nums)):
            if nums[i] in see:
                if i-see[nums[i]]<=k:
                    return True
            see[nums[i]]=i
        return False