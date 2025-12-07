class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=[]
        self.solve(candidates,target,0,ans,[])
        return [list(s) for s in ans]
    def solve(self,candidates,target,st,ans,temp):
        if target==0:
            ans.append(tuple(temp))
            return
        if target<=0:
            return
        for i in range(st,len(candidates)):
            self.solve(candidates,target-candidates[i],i,ans,temp+[candidates[i]])
        return

        