class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k%n==0) return;

        reverse(nums,0,n-1);
        reverse(nums,0,k%n-1);
        reverse(nums,k%n,n-1);
    }

    void reverse(int[] arr,int s,int e){
        while(s<e){
            int t = arr[s];
            arr[s++] = arr[e];
            arr[e--] = t;
        }
    }
}