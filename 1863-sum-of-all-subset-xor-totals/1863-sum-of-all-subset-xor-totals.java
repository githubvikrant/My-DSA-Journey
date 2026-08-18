class Solution {
    public int subsetXORSum(int[] nums) {
        return xorSum(nums,0,0);
    }

    int xorSum(int[] nums, int index, int xor){
        if(index == nums.length) return xor;

        int pick = xorSum(nums,index+1,xor ^ nums[index]);
        int notpick = xorSum(nums,index+1,xor);
        System.out.println(pick + " " + notpick);
        return pick + notpick;
    }
}