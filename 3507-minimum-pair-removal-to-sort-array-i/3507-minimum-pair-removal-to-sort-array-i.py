class Solution:
    def minimumPairRemoval(self, nums: List[int]) -> int:
        op=0
        while not self.isSorted(nums):
            minSum=10**18
            minIdx=-1
            for i in range(0,len(nums)-1):
                sum=nums[i]+nums[i+1]
                if sum<minSum:
                    minSum=sum
                    minIdx=i
            nums[minIdx]=minSum
            for i in range(minIdx+1,len(nums)-1):
                nums[i]=nums[i+1]
            del nums[len(nums)-1]
            op+=1
        return op

    
    def isSorted(self,nums):
        for i in range(1,len(nums)):
            if nums[i]<nums[i-1]:
                return False
        return True


        