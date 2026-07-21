class Solution:
    def maxActiveSectionsAfterTrade(self, s: str) -> int:
        t = "1" + s + "1"
        original_ones = s.count("1")
        
        zero_blocks = []
        current_zero_len = 0
        
        for char in t:
            if char == '0':
                current_zero_len += 1
            else:
                if current_zero_len > 0:
                    zero_blocks.append(current_zero_len)
                    current_zero_len = 0
                    
        if len(zero_blocks) < 2:
            return original_ones

        max_trade_gain = 0
        for i in range(len(zero_blocks) - 1):
            current_gain = zero_blocks[i] + zero_blocks[i + 1]
            max_trade_gain = max(max_trade_gain, current_gain)
            
        return original_ones + max_trade_gain
