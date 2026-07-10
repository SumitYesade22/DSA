class Solution:
    def buddyStrings(self, s: str, goal: str) -> bool:
        c=0
        if len(s)!=len(goal):
            return False
        for i in range(len(s)):
            if s[i]!=goal[i]:
                c+=1
        if s==goal:
            if len(set(s))<len(s):
                return True
        
        diff_s = []
        diff_goal = []
        for i in range(len(s)):
            if s[i] != goal[i]:
                diff_s.append(s[i])
                diff_goal.append(goal[i])

        # Must have exactly 2 mismatches, AND they must form a valid swap
        # (e.g., diff_s = ['a', 'b'] and diff_goal = ['b', 'a'])
        return len(diff_s) == 2 and diff_s == diff_goal[::-1]
        