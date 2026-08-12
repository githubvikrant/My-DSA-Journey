class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] efforts = new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(efforts[i],Integer.MAX_VALUE);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));

        pq.offer(new int[]{0,0,0});

        // Directions: up, down, left, right
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while(!pq.isEmpty()){
            int[] node = pq.poll();

            int effort = node[0];
            int row = node[1];
            int col = node[2];

            if(row == m-1 && col == n-1) return effort;  // ans
            if(effort > efforts[row][col]) continue;

            for(int[] dir : directions){
                int nr = row + dir[0];
                int nc = col + dir[1];
                
                if(nr<0 || nr>=m || nc<0 || nc>=n) continue;

                int edgeEffort = Math.abs(heights[row][col] - heights[nr][nc]);
                int newEffort = Math.max(effort, edgeEffort);

                if(newEffort < efforts[nr][nc]){
                    efforts[nr][nc] = newEffort;
                    pq.offer(new int[]{newEffort,nr,nc});
                }

            }
        }

        return 0;
    }
}