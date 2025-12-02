class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        s={}
        for num in arr:
            if num in s:
                s[num]+=1
            else:
                s[num]=1
        uni=set()
        for key,val in s.items():
            if val in uni:
                return False
            else:
                uni.add(val)
        return True       