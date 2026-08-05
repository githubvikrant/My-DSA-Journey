class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                bfs(isConnected,i,vis);
            }
        }
        return count;
    }

    void bfs(int[][] isConnected,int i, boolean[] vis){
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int j=0;j<n;j++){
                if(isConnected[front][j] == 1 && vis[j]==false){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }

}