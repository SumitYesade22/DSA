from collections import Counter

class Solution:
    def maxProduct(self, n: int) -> int:
        digit_counts = Counter(str(n))
        
        sorted_pairs = sorted(digit_counts.items(), key=lambda item: item[0])
        
        highest_key, highest_count = sorted_pairs[-1]
        highest_digit = int(highest_key)
        
        if highest_count >= 2:
            return highest_digit * highest_digit
            
        second_highest_digit = int(sorted_pairs[-2][0])
        return highest_digit * second_highest_digit
