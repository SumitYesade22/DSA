class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        str1=""
        for val in word1:
           str1+=val
        str2=""
        for val in word2:
            str2+=val

        return str1==str2
        