class Solution:
    def minMirrorPairDistance(self, nums: List[int]) -> int:
        prev = {}
        ans = float('inf')
        
        for i, num in enumerate(nums):
            # Agar current number pehle kisi number ka reverse ban chuka hai
            if num in prev:
                ans = min(ans, i - prev[num])
            
            # Current number ka reverse nikal kar map mein update karein
            # Hamesha latest index 'i' dalenge taaki distance minimum mile
            rev = int(str(num)[::-1])
            prev[rev] = i
            
        # Agar koi pair nahi mila toh -1 return karein
        return ans if ans != float('inf') else -1