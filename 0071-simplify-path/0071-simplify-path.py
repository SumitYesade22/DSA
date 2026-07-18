class Solution:
    def simplifyPath(self, path: str) -> str:
        arr=path.split("/")
        stack=[]
        for a in arr:
            if a=="." or a=="":
                continue
            elif a=="..":
                if stack:
                    stack.pop()
            else:
                stack.append(a)
        ans="/"
        return ans+"/".join(stack)

        