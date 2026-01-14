class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        self.ans=[]
        self.backtrack("",0,s)
        return self.ans
    def backtrack(self,temp,i,s):
        if i>=len(s):
            self.ans.append(temp)
            return 
        if not s[i].isdigit():
            self.backtrack(temp+s[i].upper(),i+1,s)
        self.backtrack(temp+s[i].lower(),i+1,s)
        return 
