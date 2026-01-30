class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        n=len(nums)
        m=0
        ans=0
        i=0
        while i<n:
            c=0
            num=nums[i]
            while i<n and num==nums[i]:
                c+=1
                i+=1
            
            if c > m:
                m = c
                ans = c
            elif c == m:
                ans += c
        return ans

        

        










        