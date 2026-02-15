class Solution:
    def toggleLightBulbs(self, bulbs: list[int]) -> list[int]:
        d=Counter(bulbs)
        ans=[]
        for key,val in d.items():
            if val%2==1:
                ans.append(key)
        ans.sort()
        return ans

        