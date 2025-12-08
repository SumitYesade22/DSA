class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp={}
        for s in strs:
            key="".join(sorted(s))
            if key in mp:
                mp[key].append(s)
            else:
                mp[key]=[s]
                # mp[key].append(s)
        return list(mp.values())
        a