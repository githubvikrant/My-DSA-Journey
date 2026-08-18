class Solution {
    public int findTheWinner(int n, int k) {
       
 
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