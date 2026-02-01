class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        d = Counter(nums)
        n = len(nums)

        duplicate = -1
        missing = -1

        for i in range(1, n + 1):
            if i not in d:
                missing = i
            elif d[i] > 1:
                duplicate = i

        return [duplicate, missing]
        