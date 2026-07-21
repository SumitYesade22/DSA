class Solution:
    def findGCD(self, nums: List[int]) -> int:
        nums.sort()
        return self.gcd(nums[0],nums[len(nums)-1])
    def gcd(self,a,b):
        while b>0:
            temp=a
            a=b
            b=temp%b
        return a
        