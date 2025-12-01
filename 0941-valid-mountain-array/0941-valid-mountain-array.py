class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        up = True
        n = len(arr)
        if n < 3:
            return False
        
        for i in range(1, n):
            if up:
                if arr[i] > arr[i-1]:
                    continue
                elif arr[i] == arr[i-1]:
                    return False
                else:
                    # switching to decreasing
                    up = False
                    # peak cannot be first element (i-1==0)
                    if i - 1 == 0:
                        return False
            else:
                if arr[i] < arr[i-1]:
                    continue
                else:
                    return False
        
        # must have switched to decreasing at least once
        return up == False
