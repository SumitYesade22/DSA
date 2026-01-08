class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        d=Counter(arr)
        i=0
        for key,val in d.items():
            if val==1:
                i+=1
                if i==k:
                    return key
        return ""
        