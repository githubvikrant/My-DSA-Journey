class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int count = 0;
        int longest = 0;
        for(int ele : set){
            if(!set.contains(ele-1)){
                int curr = ele;
                count = 1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
            }
            longest = Math.max(count,longest);
        }

        return longest;
    }
}