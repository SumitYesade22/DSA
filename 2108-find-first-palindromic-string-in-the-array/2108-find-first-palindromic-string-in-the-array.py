class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        ans=""
        for word in words:
            if self.ispalindrome(word):
                return word
        return ans
    def ispalindrome(self,word):
        i=0
        j=len(word)-1
        while i<j:
            if word[i]!=word[j]:
                return False
            i+=1
            j-=1
        return True        