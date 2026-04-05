from collections import defaultdict

class Solution:
    def mirrorFrequency(self, s: str) -> int:
        hashmap = defaultdict(int)
        for char in s:
            hashmap[char] += 1
            
        checked_chars = set()
        ans = 0
        
        
        for char in list(hashmap.keys()):
            if char in checked_chars:
                continue
                
            count = hashmap[char]
            
            if char.isalpha():
                idx = ord(char) - ord('a')
                mirror = chr(ord('z') - idx)
            else:
                idx = ord(char) - ord('0')
                mirror = chr(9 - idx + ord('0'))
            
            mirror_count = hashmap.get(mirror, 0)
            ans += abs(count - mirror_count)
            
            checked_chars.add(char)
            checked_chars.add(mirror)
            
        return ans
