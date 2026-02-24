class Solution:
    def scoreDifference(self, nums: List[int]) -> int:
        first, second = 0, 0
        is_first = True
        for i, n in enumerate(nums):
            if n % 2 == 1:
                is_first = not is_first
            if i % 6 == 5:
                is_first = not is_first
            
            if is_first:
                first += n
            else:
                second += n
        return first - second
        