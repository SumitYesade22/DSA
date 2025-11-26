class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        s = {}
        i = 0
        for num in nums:
            dif = target - num
            if s.get(dif) is not None:
                return [i, s[dif]]
            else:
                s[num] = i
            i += 1
        return []
