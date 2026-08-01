class Solution:
    def sumAndMultiply(self, n: int) -> int:
        if n==0:
            return 0
        sum=0
        x=""
        for char in str(n):
            sum+=int(char)
            if char=="0":
                continue
            x+=char
        return int(x)*sum
        