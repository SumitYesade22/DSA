class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        s=Counter(nums)
        sum=0
        for key,val in s.items():
            if val==1:
                sum+=key
        return sum

       

        