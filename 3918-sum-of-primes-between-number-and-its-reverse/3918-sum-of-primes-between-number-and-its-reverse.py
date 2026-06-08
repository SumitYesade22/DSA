class Solution:
    def sumOfPrimesInRange(self, n: int) -> int:
        rev=int(str(n)[::-1])
        start=min(n,rev)
        end=max(n,rev)
        is_prime=[True]*(end+1)
        is_prime[0]=False
        is_prime[1]=False
        p=2
        while p*p<=end:
            if is_prime[p]:
                for i in range(p*p,end+1,p):
                    is_prime[i]=False
            p+=1
        total_sum = 0
        for num in range(start, end + 1):
            if is_prime[num]:
                total_sum += num
                
        return total_sum


        