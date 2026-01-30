class Solution:
    def findingUsersActiveMinutes(self, logs: List[List[int]], k: int) -> List[int]:
        ans = [0] * k
        d = defaultdict(set)

        for user, minute in logs:
            d[user].add(minute)   

        for user in d:
            u = len(d[user])      
            if u <= k:
                ans[u - 1] += 1

        return ans
       