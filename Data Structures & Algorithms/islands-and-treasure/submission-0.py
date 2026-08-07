class Solution:
    def islandsAndTreasure(self, grid: List[List[int]]) -> None:
        if not grid:
            return
        rows,cols = len(grid) , len(grid[0])
        q = collections.deque()
        visited = set()

        for r in range(len(grid)):
            for c in range(len(grid[0])):
                if grid[r][c] == 0:
                    q.append((r,c))
                    visited.add((r,c))
        directions = [[1,0],[-1,0],[0,1],[0,-1]]
        while q:
            row,col = q.popleft()
            for dr,dc in directions:
                nr,nc = row+dr , col+dc
                if(0 <= nr < rows and 0 <= nc < cols and (nr,nc) not in visited and grid[nr][nc] != -1):
                    grid[nr][nc] = grid[row][col] + 1
                    q.append((nr,nc))
                    visited.add((nr,nc))
        