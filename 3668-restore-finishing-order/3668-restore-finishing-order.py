class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:
        s=set()
        for num in friends:
            s.add(num)
        ans=[]
        for num in order:
            if num in s:
                ans.append(num)
        return ans
        