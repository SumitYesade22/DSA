class Solution:
    def judgeCircle(self, moves: str) -> bool:
        i=0
        j=0
        for l in range(len(moves)):
            if moves[l]=='U':
                i-=1
            elif moves[l]=='D':
                i+=1
            elif moves[l]=='R':
                j+=1
            else:
                j-=1
        return i==0 and j==0
        