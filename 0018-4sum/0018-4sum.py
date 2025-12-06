class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        ans=set()
        nums.sort()
        for i in range(len(nums)-3):
            for j in range(i+1,len(nums)-2):
                left=j+1
                right=len(nums)-1
                while left<right:
                    sum=nums[i]+nums[j]+nums[left]+nums[right]
                    if sum==target:
                        ans.add((nums[i],nums[j],nums[left],nums[right]))
                        left+=1
                        right-=1
                    elif sum>target:
                        right-=1
                    else:
                        left+=1
        final=[list(s) for s in ans]
        return final


