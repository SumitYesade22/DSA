class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ans=set()
        candidates.sort()
        self.solve(candidates,target,0,ans,[])
        return [list(s) for s in ans]
    def solve(self,candidates,target,st,ans,temp):
        if target==0:
            ans.add(tuple(temp))
            return
        if target<=0:
            return
        for i in range(st,len(candidates)):
            if i>st and candidates[i-1]==candidates[i]:
                continue
            self.solve(candidates,target-candidates[i],i+1,ans,temp+[candidates[i]])
        return
        