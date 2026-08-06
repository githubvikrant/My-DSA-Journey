class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size()>0){
            int curr = q.remove();
            for(int ele: rooms.get(curr)){
                if(!vis[ele]){
                    vis[ele] = true;
                    q.add(ele);
                }
            }
        }

        for(boolean ele: vis){
            if(!ele){
                return false;
            }
        }

        return true;

    }
}