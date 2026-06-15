class Solution:
    def generateString(self, str1: str, str2: str) -> str:
        n=len(str1)
        m=len(str2)
        N = n + m - 1
        word = ['$'] * N
        can_change = [False] * N
        for i in range(n):
            if str1[i] == 'T':
                for j in range(m):
                    if word[i + j] != '$' and word[i + j] != str2[j]:
                        return "" 
                    word[i + j] = str2[j]
        for i in range(N):
            if word[i] == '$':
                word[i] = 'a'
                can_change[i] = True
        def is_same(start_idx: int) -> bool:
            for j in range(m):
                if word[start_idx + j] != str2[j]:
                    return False
            return True
        for i in range(n):
            if str1[i] == 'F':
                if is_same(i):
                    changed = False
                   
                    for k in range(i + m - 1, i - 1, -1):
                        if can_change[k]:
                            word[k] = 'b'
                            can_change[k] = False 
                            changed = True
                            break
                    
                    if not changed:
                        return ""
        return "".join(word)