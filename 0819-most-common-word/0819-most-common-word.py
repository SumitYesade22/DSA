class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        for ch in string.punctuation:
            paragraph=paragraph.replace(ch," ")
        li=paragraph.lower().split()
        hashmap=Counter(li)
        sor=dict(sorted(hashmap.items(),key=lambda x:x[1],reverse=True))
        for key , val in sor.items():
            if key in banned:
                continue
            else:
                return key
        