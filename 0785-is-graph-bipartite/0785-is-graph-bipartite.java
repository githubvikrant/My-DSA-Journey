class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color,-1);

        // 0 is red and 1 is green
        for(int i=0;i<n;i++){
            if(color[i] == -1){
                boolean ans = bfs(graph,color,i);
                if(!ans) return ans;
            }
        }
        return true;
        
    }

    boolean bfs(int[][] graph, int[] color, int i){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        color[i] = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int node:graph[curr]){
                if(color[node] == -1){
                    q.add(node);
                    color[node] = 1-color[curr];

                }else if(color[node] == color[curr]){
                    return false;
                }
            }
        }
        return true;
    }
}