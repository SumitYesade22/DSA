class Solution:
    def totalNumbers(self, digits: List[int]) -> int:
        s=set()
        visited=[0]*len(digits)
        self.solve(digits,"",s,visited)
        return len(s)
    def solve(self,digits,string,s,visited):
        
        if len(string)==3:
            if string[0]!="0" and int(string[2])%2==0:
                s.add(string)
            return
        for i in range(0,len(digits)):
            if visited[i]==1:
                continue
            else:
                visited[i]=1
                self.solve(digits,string+str(digits[i]),s,visited)
                visited[i]=0
        

        