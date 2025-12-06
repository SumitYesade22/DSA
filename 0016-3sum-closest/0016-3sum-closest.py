class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        stsum=0
        minsum=0
        diff=10**18
        for i in range(len(nums)-2):
            left=i+1
            right=len(nums)-1
            while left < right:
                sum=nums[i]+nums[left]+nums[right]
                if sum==target:
                    return sum
                elif sum<target:
                    left+=1
                else:
                    right-=1
                dif=abs(target-sum)
                if dif < diff:
                    diff=dif
                    minsum=sum
        return minsum
                


        