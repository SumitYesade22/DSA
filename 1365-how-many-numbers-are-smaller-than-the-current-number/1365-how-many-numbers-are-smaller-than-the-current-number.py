class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        arr=sorted(nums)
        m={}
        for i,n in enumerate(arr):
            if n not in m:
                m[n]=i
        res=[]
        for n in nums:
            res.append(m[n])
        return res