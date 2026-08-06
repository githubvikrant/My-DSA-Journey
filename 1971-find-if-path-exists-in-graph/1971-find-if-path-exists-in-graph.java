

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination){
            return true;
        }
        //first we will create our adjacency list

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        // now we will do bfs traversal from the given source node
        boolean[] vis = new boolean[n];
        vis[source] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(q.size()>0){
            int curr = q.remove();
            for(int ele : adj.get(curr)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                    if(vis[destination] == true){
                        return true;
                    }
                }
            }
        }
        
        return vis[destination];

    }
}