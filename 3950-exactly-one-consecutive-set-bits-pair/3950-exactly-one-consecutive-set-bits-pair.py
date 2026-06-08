class Solution:
    def consecutiveSetBits(self, n: int) -> bool:
        binary_str = bin(n)[2:]
        
        pair_count = 0
        # Pura string check karo consecutive '11' ke liye
        for i in range(len(binary_str) - 1):
            if binary_str[i] == '1' and binary_str[i+1] == '1':
                pair_count += 1
                
        # Hamein exactly 1 pair chahiye
        return pair_count == 1