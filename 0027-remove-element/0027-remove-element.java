class Solution {
    public int removeElement(int[] nums, int val) {
        // two pointers

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                continue;
            }
            else{
              nums[j++] = nums[i];
            }
        }

        return j;
    }
}