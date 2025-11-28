class Solution:
    def canJump(self, nums: List[int]) -> bool:
        i=0
        jump=0
        sum=0
        for num in nums:
            if jump<i:
                return False
            sum=i+num
            jump=max(sum,jump)
            
            i+=1
        return True

        