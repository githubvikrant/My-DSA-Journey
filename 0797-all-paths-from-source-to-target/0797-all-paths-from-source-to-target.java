class Solution {
   
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //we need a dfs
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        helperDFS(graph,result,path,0);

        return result;
    }

    void helperDFS(int[][] graph, List<List<Integer>> result,List<Integer> path,int curr){
        int size = graph[curr].length;
        if(curr == graph.length -1){
            result.add(new ArrayList(path));
            return;
        }

        for(int i=0;i<size;i++){
            int val = graph[curr][i];
            path.add(val);
            
            helperDFS(graph,result,path,val);
            path.remove(path.size()-1);
        }

    }

}
