class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        mp=defaultdict(int)
        ans=[]
        for dig in digits:
            mp[dig]+=1
        for i in range(1,10):
            if mp[i]==0:
                continue
            mp[i]-=1
            for j in range(0,10):
                if mp[j]==0:
                    continue
                mp[j]-=1
                for m in range(0,10,2):
                    if mp[m]==0:
                        continue
                    
                    combined_num = int(f"{i}{j}{m}")
                    ans.append(combined_num)
                mp[j]+=1
            
            mp[i]+=1
        
        return ans