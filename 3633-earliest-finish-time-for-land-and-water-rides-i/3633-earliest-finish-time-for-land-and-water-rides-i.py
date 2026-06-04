class Solution:
    def earliestFinishTime(self, landStartTime: List[int], landDuration: List[int], waterStartTime: List[int], waterDuration: List[int]) -> int:
        return min(self.solvekarde(landStartTime,landDuration,waterStartTime,waterDuration),self.solvekarde(waterStartTime,waterDuration,landStartTime,landDuration))


    def solvekarde(self,arr1,arr2,arr3,arr4):
        jaldi=float('inf')
        khatam=float('inf')
        cf=0
        for i in range(len(arr1)):
            jaldi=min(jaldi,arr1[i]+arr2[i])
        
        for i in range(len(arr3)):
            cf=max(jaldi,arr3[i])+arr4[i]
            khatam=min(khatam,cf)
        return khatam

        