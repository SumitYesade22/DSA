class Solution:
    def countCoveredBuildings(self, n: int, buildings: List[List[int]]) -> int:
        yToMinMaxX = {}
        xToMinMaxY = {}

       
        for x, y in buildings:
            
            if y not in yToMinMaxX:
                yToMinMaxX[y] = [float('inf'), float('-inf')]
            
            if x not in xToMinMaxY:
                xToMinMaxY[x] = [float('inf'), float('-inf')]

            yToMinMaxX[y][0] = min(yToMinMaxX[y][0], x)
            yToMinMaxX[y][1] = max(yToMinMaxX[y][1], x)

    
            xToMinMaxY[x][0] = min(xToMinMaxY[x][0], y)
            xToMinMaxY[x][1] = max(xToMinMaxY[x][1], y)

        result = 0

 
        for x, y in buildings:
            minX, maxX = yToMinMaxX[y]
            minY, maxY = xToMinMaxY[x]

            if minX < x < maxX and minY < y < maxY:
                result += 1

        return result
        

        