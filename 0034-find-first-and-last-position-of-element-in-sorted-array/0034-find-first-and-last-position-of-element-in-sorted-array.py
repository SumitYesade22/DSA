class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start=self.solve(nums,target,True)
        end=self.solve(nums,target,False)
        ans=[start,end]
        return ans
    
    def solve(self,nums,target,findfirst):
        left=0
        id=-1
        right=len(nums)-1
        while(left<=right):
            mid=left+(right-left)//2
            if nums[mid]==target:
                id=mid
                if findfirst:
                    right=mid-1
                else:
                    left=mid+1
            elif nums[mid]>target:
                right=mid-1
            else:
                left=mid+1
        return id
            
        