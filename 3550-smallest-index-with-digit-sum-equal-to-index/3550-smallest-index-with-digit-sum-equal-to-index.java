class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum = getSum(nums[i]);
            if(sum==i){
                return i;
            }
        }
        return -1;
    }

    int getSum(int num){
        int sum = 0;
        while(num>0){
           sum += num%10;
           num = num/10;
        }
        return sum;
    }
}