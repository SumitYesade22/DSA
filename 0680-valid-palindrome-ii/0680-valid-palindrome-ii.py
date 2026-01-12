class Solution:
    def validPalindrome(self, s: str) -> bool:
        ans=self.solve(s,0,len(s)-1,1)
        return ans
    def solve(self,s,i,j,d):
        if d<0:
            return False
        if i>=j:
            return True
        
        if s[i]==s[j]:
            return self.solve(s,i+1,j-1,d)
        else:
            return self.solve(s,i+1,j,d-1) or self.solve(s,i,j-1,d-1)
        


        
        