class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        d=Counter(nums)
        s=sorted(d.items(),key=lambda x:(x[1],-x[0]))
        ans=[]
        for li in s:
            c=li[1]
            while c!=0:
                c-=1
                ans.append(li[0])
        return ans
        