class Solution:
    def uniformArray(self, nums1: list[int]) -> bool:
        odd=False
        even=False
        prevodd=False
        preveven=False
        nums1.sort()
        if nums1[0]%2==0:
            even=True
            preveven=True
        else:
            odd=True
            prevodd=True
        for i in range(1,len(nums1)):
            if (even and nums1[i]%2==0) or (odd and nums1[i]%2==1):
                continue
            elif nums1[i]%2==0 and prevodd==True:
                preveven=True
                continue
            elif nums1[i]%2==1 and prevodd==True:
                prevodd=True
                continue
            else:
                return False
        return True
        