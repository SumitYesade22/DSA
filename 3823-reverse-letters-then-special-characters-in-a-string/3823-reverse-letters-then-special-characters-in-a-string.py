class Solution:
    def reverseByType(self, s: str) -> str:
        alpha=[]
        special=[]
        for char in s:
            if char.isalpha():
                alpha.append(char)
            else:
                special.append(char)
        alpha.reverse()
        special.reverse()
        i=0
        j=0
        ans=""
        for k in range(len(s)):
            if s[k].isalpha():
                ans+=alpha[i]
                i+=1
            else:
                ans+=special[j]
                j+=1
        return ans

            
        