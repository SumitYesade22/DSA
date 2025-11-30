class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        s=set()
        for num in candyType:
            s.add(num)
        return min(len(candyType)//2,len(s))
        