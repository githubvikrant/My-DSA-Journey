class Solution {
    public int findTheWinner(int n, int k) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     list.add(i);
        // }
        // int index = 0;
        // while(list.size()>1){
        //     index = (index + (k-1))%list.size();
        //     list.remove(index);
        // }

        // return list.get(0);
 
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }

        int index = 0;

        while(queue.size()>1){
            //k-1 rotations
            for(int i=0;i<k-1;i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        return queue.peek();
    }
}