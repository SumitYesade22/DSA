class Solution:
    def decimalRepresentation(self, n: int) -> List[int]:
        ans=[]

        st="1"
        while n!=0:
            temp=n%10
            if temp*int(st)!=0:
                ans.append(temp*int(st))
            st=st+"0"
            n=n//10
        return ans[::-1]

        