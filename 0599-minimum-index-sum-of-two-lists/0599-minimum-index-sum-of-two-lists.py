class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        res=list(set(list1) & set(list2))
        m=float('inf')
        ans=[]
        for word in res:
            sum=list1.index(word)+list2.index(word)
            if sum < m:
                m = sum
                ans = [word]      # reset
            elif sum == m:
                ans.append(word)
        
        return ans

        