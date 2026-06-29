class Solution:
    def isPathCrossing(self, path: str) -> bool:
        d={
            "N":(0,1),
            "S":(0,-1),
            "E":(1,0),
            "W":(-1,0)
        }
        st=set()
        cx=0
        cy=0
        st.add((0,0))
        for s in path:
            cx=d[s][0]+cx
            cy=d[s][1]+cy
            if (cx,cy) in st:
                return True
            st.add((cx,cy))
        return False


        