class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        score=0
        for i in range(len(operations)):
            if operations[i]=='--X' or operations[i]=='X--':
                score-=1
            else:
                score+=1
        return score
            
        