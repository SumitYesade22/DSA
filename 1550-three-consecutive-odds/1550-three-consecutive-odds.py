class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        ans=0
        for num in arr:
            if num%2==1:
                ans+=1
            else:
                ans=0
            if ans==3:
                return True
        return False
        