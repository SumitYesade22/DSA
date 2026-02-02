class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        st=nums[1:len(nums)]
        st.sort()
        return nums[0]+st[0]+st[1]
        