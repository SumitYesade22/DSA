class Solution:
    def isVowel(self, ch: str) -> bool:
        ch = ch.lower()
        return ch in {'a', 'e', 'i', 'o', 'u'}

    def sortVowels(self, s: str) -> str:
        # Collect vowels
        temp = []
        for ch in s:
            if self.isVowel(ch):
                temp.append(ch)

        # Sort vowels
        temp.sort()

        # Replace vowels in original string
        s = list(s)   # strings are immutable in Python
        j = 0
        for i in range(len(s)):
            if self.isVowel(s[i]):
                s[i] = temp[j]
                j += 1

        return "".join(s)
    
        