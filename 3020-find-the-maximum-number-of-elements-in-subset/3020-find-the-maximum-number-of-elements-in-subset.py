class Solution:
    def maximumLength(self, nums: List[int]) -> int:
        mp=Counter(nums)
        ones = mp[1]
        result = ones if ones % 2 == 1 else max(0, ones - 1)
        for num in mp:
            if num == 1:
                continue
                
            curr = num
            length = 0
            
            # Keep squaring as long as we have at least 2 elements of the current number
            while curr in mp and mp[curr] > 1:
                length += 2
                curr = curr * curr
                
            # Check the final peak element of the sequence
            if curr in mp:
                length += 1
            else:
                length -= 1
                
            result = max(result, length)
            
        return result
        