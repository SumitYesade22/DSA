class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        ch={}
        for word in chars:
            ch[word]=1+ch.get(word,0)
        res=0
        for word in words:
            copy=ch.copy()
            ans=True
            for c in word:
                if c in copy and copy[c]!=0:
                    copy[c]-=1
                else:
                    ans=False
                    break
                    
            if ans:
                res+=len(word)
        return res
