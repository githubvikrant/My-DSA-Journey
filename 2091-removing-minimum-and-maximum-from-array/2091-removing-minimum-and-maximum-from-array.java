class Solution {
    public int minimumDeletions(int[] nums) {
        int len = nums.length;
        int hl = len / 2;
        int deletions = 0;

        
        if(len<3) return len;


        int maxidx = 0;
        int minidx = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[maxidx]) {
                maxidx = i;
            }
            if (nums[i] < nums[minidx]) {
                minidx = i;
            }
        }

        int small = Math.min(minidx, maxidx);
        int large = Math.max(minidx, maxidx);

        // Both from front
        int front = large + 1;

        // Both from back
        int back = len - small;

        // One from front and one from back
        int both = small + 1 + len - large;

        return Math.min(front, Math.min(back, both));

       
        


    }
}