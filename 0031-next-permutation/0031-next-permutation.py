class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        idx=-1
        for i in range(len(nums)-1,0,-1):
            if nums[i-1]<nums[i]:
                idx=i-1
                break
        revIdx=-1
        if idx!=-1:
            for i in range(len(nums)-1,-1,-1):
                if nums[i]>nums[idx]:
                    revIdx=i
                    break
            self.swap(revIdx,idx,nums)
        self.reverse(nums,idx+1,len(nums)-1)
    def swap(self,revIdx,idx,nums):
        temp=nums[revIdx]
        nums[revIdx]=nums[idx]
        nums[idx]=temp
    def reverse(self,nums,st,de):
        while st<de:
            temp=nums[st]
            nums[st]=nums[de]
            nums[de]=temp
            st+=1
            de-=1


        