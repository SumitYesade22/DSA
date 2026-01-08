class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        m=0
        for s in sentences:
            l=s.split(" ")
            m=max(m,len(l))
        return m

        