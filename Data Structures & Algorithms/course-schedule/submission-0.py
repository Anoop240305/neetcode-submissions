class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = defaultdict(list)
        indegree = [0]*numCourses
        for course , prereq in prerequisites:
            graph[prereq].append(course)
            indegree[course] += 1
        
        queue = deque([i for i in range(numCourses) if indegree[i] == 0])
        order = []
        finish = 0
        while queue:
            node = queue.popleft()
            finish += 1
            for nei in graph[node]:
                indegree[nei] -= 1
                if indegree[nei] == 0:
                    queue.append(nei)
        return finish == numCourses    