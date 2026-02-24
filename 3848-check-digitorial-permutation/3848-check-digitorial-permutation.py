class Solution:
    def isDigitorialPermutation(self, n: int) -> bool:
        original = n
        
        # extract digits
        digits = []
        while n > 0:
            digits.append(n % 10)
            n //= 10
        
        # factorial memo
        self.factdp = {}
        
        # compute sum of factorials
        fact_sum = 0
        for d in digits:
            fact_sum += self.factorial(d)
        
        # compare digit frequency
        return sorted(str(original)) == sorted(str(fact_sum))
    
    def factorial(self, num):
        if num == 0 or num == 1:
            return 1
        if num in self.factdp:
            return self.factdp[num]
        self.factdp[num] = num * self.factorial(num - 1)
        return self.factdp[num]