class Solution:
    def numberOfMatches(self, n: int) -> int:
        total_matches=0
        while n!=1:
            if n%2==1:
                matches=(n-1)//2
                n=matches+1
            else:
                matches=n//2
                n=matches
            total_matches+=matches
            
        return total_matches
            
        