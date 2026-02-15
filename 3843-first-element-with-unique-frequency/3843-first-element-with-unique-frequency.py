class Solution:
    def firstUniqueFreq(self, nums: List[int]) -> int:
        d=Counter(nums)
        freq=defaultdict(list)
        for key , val in d.items():
            freq[val].append(key)
        for num in nums:
            if len(freq[d[num]])==1:
                return num
        return -1

        