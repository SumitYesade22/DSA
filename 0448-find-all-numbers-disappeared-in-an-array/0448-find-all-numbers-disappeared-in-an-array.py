class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        for num in nums:
            ind=abs(num)-1
            if nums[ind]>0:
                nums[ind]*=-1
        res=[]
        i=0
        for num in nums:
            if num>0:
                res.append(i+1)
            i+=1

        return res