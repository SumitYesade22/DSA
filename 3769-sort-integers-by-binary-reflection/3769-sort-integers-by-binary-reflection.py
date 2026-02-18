class Solution:
    def sortByReflection(self, nums: List[int]) -> List[int]:
        ans=[]
        for num in nums:
            b=bin(num)[2:]
            rf=b[::-1]
            reflect=int(rf,2)
            ans.append((reflect,num))
        ans.sort()
        return [i for _,i in ans]
        