class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        mx=0
        arr=[]
        for i in range(len(nums)):
            mx=max(nums[i],mx)
            arr.append(self.gcd(mx,nums[i]))
        arr.sort()
        left=0
        right=len(arr)-1
        sum=0
        while left<right:
            sum+=self.gcd(arr[left],arr[right])
            left+=1
            right-=1
        return sum
    def gcd(self,a,b):
        while b>0:
            temp=a
            a=b
            b=temp%b
        return a
        
            



        