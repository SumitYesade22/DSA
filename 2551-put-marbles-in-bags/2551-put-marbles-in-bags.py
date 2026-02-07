class Solution:
    def putMarbles(self, weights: List[int], k: int) -> int:
        arr=[]
        if k==1:
            return 0
        for i in range(len(weights)-1):
            arr.append(weights[i]+weights[i+1])
        arr.sort()
        minsum = sum(arr[:k-1])
        maxsum = sum(arr[-(k-1):])
        return maxsum-minsum


        