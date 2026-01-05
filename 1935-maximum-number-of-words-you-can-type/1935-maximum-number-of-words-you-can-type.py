class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        broken=set(brokenLetters)
        l=text.split(" ")
        count=0
        for word in l:
            for c in word:
                if c in broken:
                    count+=1
                    break
        return len(l)-count


        