class Solution:
    def beautifulSubsets(self, nums: List[int], k: int) -> int:
        self.k=k
        self.result=0
        self.freq=defaultdict(int)
        self.solve(0,nums)
        return self.result-1
    def solve(self,i,nums):
        if i>=len(nums):
            self.result+=1
            return 
        self.solve(i+1,nums)
        if self.freq[nums[i]-self.k]==0 and self.freq[nums[i]+self.k]==0:
            self.freq[nums[i]]+=1
            self.solve(i+1,nums)
            self.freq[nums[i]]-=1
            if self.freq[nums[i]]==0:
                del self.freq[nums[i]]

        