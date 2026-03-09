class Solution:
    def minimumIndex(self, capacity: list[int], itemSize: int) -> int:
        minindex=-1
        minelement=float(inf)
        for i , num in enumerate(capacity):
            if num>=itemSize and num<minelement:
                minindex=i
                minelement=num
        return minindex


        