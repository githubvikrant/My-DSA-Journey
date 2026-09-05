class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        
        max[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max[i-1]){
                max[i] = nums[i];
            }else{
                max[i] = max[i-1];
            }
        }
        min[nums.length-1] = nums[nums.length-1];
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<min[i+1]){
                min[i] = nums[i];
            }else{
                min[i] = min[i+1];
            }
        }

      
       
        int smallestDiff = Integer.MAX_VALUE;
        int stableIdx = -1;
        for(int i=0;i<nums.length;i++){
            int diff = max[i] - min[i];
           
            if(diff<=k ){ 
                 return i;
            }
        }

       return stableIdx;
    }
}